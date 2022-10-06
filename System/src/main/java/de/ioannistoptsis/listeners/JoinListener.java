package de.ioannistoptsis.listeners;

import de.ioannistoptsis.inventories.JoinInv;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player spieler = event.getPlayer();

        spieler.sendMessage("");
        spieler.sendMessage("§8- §6§lPIXELBREI §8-");
        spieler.sendMessage("§3Moin §e" + spieler.getName() + "§7!");
        spieler.sendMessage("");
        spieler.sendMessage("§3Spieler Online§7: §ePLATZHALTER");
        spieler.sendMessage("§3Freunde Online§7: §ePLATZHALTER"); // todo Freunde Online Counter
        spieler.sendMessage("");
        spieler.sendMessage("§cHab deine IP eeehehehe§7: §e" + spieler.getAddress());

        event.setJoinMessage(""); // Deaktiviert Join-Nachricht

        spieler.getInventory().clear();
        JoinInv.GetJoinItems(spieler);
    }
}
