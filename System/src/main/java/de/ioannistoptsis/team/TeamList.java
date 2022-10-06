package de.ioannistoptsis.team;

import org.bukkit.ChatColor;

public enum TeamList {
    ADMIN("admin", "001admin", "§4Admin §8|§4 ", "pixelbrei.admin", ChatColor.DARK_RED),
    DEVELOPER("developer", "010developer", "§bDeveloper §8|§b ", "pixelbrei.developer", ChatColor.AQUA),
    USER("user", "100user", "§aUser §8|§a ", "pixelbrei.user", ChatColor.GREEN);

    private  final String group, teamName, prefix, permission;
    private final ChatColor color;

    TeamList(String group, String teamName, String prefix, String permission, ChatColor color) {
        this.group = group;
        this.teamName = teamName;
        this.prefix = prefix;
        this.permission = permission;
        this.color = color;
    }

    public String getGroup() {
        return group;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getPermission() {
        return permission;
    }

    public ChatColor getColor() {
        return color;
    }
}
