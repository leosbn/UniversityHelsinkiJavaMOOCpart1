import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        
        //Print the top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Print the top 25 players based on penalty amounts
        System.out.println("\nTop 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Print the statistics for Sidney Crosby
        System.out.println("\nStats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Print the statistics for Philadelphia Flyers
        System.out.println("\nStats for PHI");
        //NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("PHI");
        
        //Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        System.out.println("\nPlayers in ANA ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
