package de.ioannistoptsis.listeners;

import de.ioannistoptsis.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Objects;

public class HandelPlayerChat implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        event.setFormat(Objects.requireNonNull(Main.getInstance().getTeams().getScoreboard().getPlayerTeam(player)).getPrefix() + ChatColor.GRAY + "" + player.getName() + "" + ChatColor.DARK_GRAY + ": §2" + event.getMessage());
    }
}
