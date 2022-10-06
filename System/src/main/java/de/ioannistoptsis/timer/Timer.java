package de.ioannistoptsis.timer;

import de.ioannistoptsis.Main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {
    private boolean running; // true oder false
    private int zeit;

    public Timer(boolean running, int zeit) {
        this.running = running;
        this.zeit = zeit;

        run();
    }

    public boolean isRunning() {
        return running;
    }

    public int getZeit() {
        return zeit;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }
    
    public void sendActionBar() {
        for (Player spieler : Bukkit.getOnlinePlayers()) {
            if (!isRunning()) {
                spieler.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§6§l§oPIXELBREI§8§l§o.§6§l§oNET"));
                continue;
            }

            spieler.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§a" + getZeit()));
        }
    }

    private void run() {
        new BukkitRunnable() {
            @Override
            public void run() {

                sendActionBar();

                if (!isRunning()) {
                    return;
                }

                setZeit(getZeit() + 1);
            }
        }.runTaskTimer(Main.getInstance(), 20, 20);
    }
}
