package de.ioannistoptsis.listeners;

import de.ioannistoptsis.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HandelPlayerConnection implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Main.getInstance().getTeams().addPlayerTeam(player);
    }
}
