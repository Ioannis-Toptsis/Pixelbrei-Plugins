package de.ioannistoptsis.listeners;

import de.ioannistoptsis.inventories.JoinInv;
import de.ioannistoptsis.utils.ItemAPI;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class SneakListener implements Listener {

    @EventHandler
    public void  onSneak(PlayerToggleSneakEvent event) {
        if(event.getPlayer().isSneaking()) {
            event.getPlayer().getInventory().clear();
            JoinInv.GetJoinItems(event.getPlayer());
        } else {
            event.getPlayer().getInventory().clear();
            event.getPlayer().getInventory().setItem(4, new ItemAPI(Material.FEATHER).setName("§6§l§oFlugmodus").build());
            event.getPlayer().getInventory().setItem(0, new ItemAPI(Material.REDSTONE_LAMP).setName("§c§l§oReports").build());
            event.getPlayer().getInventory().setItem(8, new ItemAPI(Material.BRICK).setName("§e§l§oBaumodus").build());
        }
    }
}
