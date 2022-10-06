package de.ioannistoptsis.team;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;
import java.util.Objects;

public class Teams {

    private final static HashMap<String, Team> teamMap = new HashMap<>();
    private final Scoreboard scoreboard;

    public Teams() {
        this.scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
    }

    public void registerTeams() {
        for(TeamList teamList : TeamList.values()) {
            if(scoreboard.getTeam(teamList.getTeamName()) != null)
                Objects.requireNonNull(scoreboard.getTeam(teamList.getTeamName())).unregister();
            Team team = scoreboard.registerNewTeam(teamList.getTeamName());
            team.setColor(teamList.getColor());
            team.setPrefix(teamList.getPrefix());
            teamMap.put(teamList.getPermission(), team);
        }
    }

    public void addPlayerTeam(Player player) {
        for(TeamList teamList : TeamList.values()) {
            if(player.hasPermission(teamList.getPermission())) {
                teamMap.get(teamList.getPermission()).addPlayer(player);
            }
        }
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }
}
