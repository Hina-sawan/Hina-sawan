/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author HINA SAWAN 79049
 */
import java.util.List;
import java.util.ArrayList;
class Player {
    private int jerseyNo;
    private String name;

    public Player(int jerseyNo, String name) {
        this.jerseyNo = jerseyNo;
        this.name = name;
    }
    public void displayPlayerInfo() {
        System.out.println("Player Name: " + name + ", Jersey No: " + jerseyNo);
    }
}
class Team {
    private String teamName;
    private List<Player> players; // Aggregation relationship

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Squad Members:");
        for (Player p : players) {
            p.displayPlayerInfo();
        }
    }
}

public class Lab6 {
    public static void main(String[] args) {
        Player p1 = new Player(18, "Virat Kohli");
        Player p2 = new Player(45, "Rohit Sharma");

        List<Player> squad = new ArrayList<>();
        squad.add(p1);
        squad.add(p2);

        Team nationalTeam = new Team("National Team", squad);
        nationalTeam.displayTeamInfo();
    }
}
