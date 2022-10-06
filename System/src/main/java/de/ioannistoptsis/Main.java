package de.ioannistoptsis;

import de.ioannistoptsis.listeners.*;
import de.ioannistoptsis.team.Teams;
import de.ioannistoptsis.timer.Timer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.Prefix;

import java.util.Optional;

public final class Main extends JavaPlugin {

    private Teams teams;

    private static Main instance;

    private Timer timer;

    public static String prefix = "§6PIXELBREI §8» ";
    public static String keinerechte = prefix + "§cKeine Berechtigung";
    public static String spielernotfound = prefix + "§cUser nicht gefunden";

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        instance = this;
        this.teams = new Teams();
        teams.registerTeams();
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(), this);
        pm.registerEvents(new QuitListener(), this);
        pm.registerEvents(new HandelPlayerConnection(), this);
        pm.registerEvents(new HandelPlayerChat(), this);
        pm.registerEvents(new SneakListener(), this);

        timer = new Timer(false, 0);

        loadconfig();
        Bukkit.getConsoleSender().sendMessage("§6§lPixelbrei§7§l-§6§lSystem wurde geladen");
    }

    private void loadconfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public Teams getTeams() {
        return teams;
    }

    public static Main getInstance() {
        return instance;
    }

    public Timer getTimer() {
        return timer;
    }
}
