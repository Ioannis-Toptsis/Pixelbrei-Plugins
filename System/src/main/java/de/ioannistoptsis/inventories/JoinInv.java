package de.ioannistoptsis.inventories;

import de.ioannistoptsis.utils.ItemAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class JoinInv {

    public static void GetJoinItems(Player spieler) {
        spieler.getInventory().setItem(4, new ItemAPI(Material.COMPASS).setName("§a§lNavigator §7(Rechtsklick)").build());
        spieler.getInventory().setItem(7, new ItemAPI(Material.STICK).setName("§c§lStille Lobby §7(Rechtsklick)").build());
        spieler.getInventory().setItem(1, new ItemAPI(Material.BARRIER).setName("§4§lKein Gadget §7(Rechtsklick)").build());
        spieler.getInventory().setItem(0, new ItemAPI(Material.CHEST).setName("§6§lInventar §7(Rechtsklick)").build());
        spieler.getInventory().setItem(8, new ItemAPI(Material.PLAYER_HEAD).setName("§5§lFreunde §7(Rechtsklick)").build());
        spieler.getInventory().setItem(6, new ItemAPI(Material.BOOK).setName("§b§lUpdates §7(Rechtsklick)").build());
        spieler.getInventory().setItem(2, new ItemAPI(Material.PAPER).setName("§3§lDein Profil §7(Rechtsklick)").build());
    }
}
