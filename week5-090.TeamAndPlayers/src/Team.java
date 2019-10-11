
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> members = new ArrayList();
    private int teamMaxSize = 16;

    public Team(String teamName) {
        this.name = teamName;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.members.size() < this.teamMaxSize) {
            this.members.add(player);
        }
    }

    public void printPlayers() {
        for (Player member : members) {
            System.out.println(member.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.teamMaxSize = maxSize;
    }

    public int size() {
        return this.members.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player member : members) {
            totalGoals += member.goals();
        }
        return totalGoals;
    }

}
