class Cricketer
{
    // Variables
    String playerName;
    int runsScored;
    int ballsFaced;
    int fours;
    int sixes;
    int wicketsTaken;
    int runsConceded;
    double oversBowled;

    // Strike Rate
    double calculateStrikeRate()
    {
        return ((double) runsScored / ballsFaced) * 100;
    }

    // Batting Average
    double calculateBattingAverage(int matchesPlayed)
    {
        return (double) runsScored / matchesPlayed;
    }

    // Economy
    double calculateEconomy()
    {
        return runsConceded / oversBowled;
    }

    // Display Stats
    void displayStats(int matchesPlayed)
    {
        System.out.println("Player Name      : " + playerName);
        System.out.println("Runs Scored      : " + runsScored);
        System.out.println("Balls Faced      : " + ballsFaced);
        System.out.println("Fours            : " + fours);
        System.out.println("Sixes            : " + sixes);
        System.out.println("Wickets Taken    : " + wicketsTaken);
        System.out.println("Runs Conceded    : " + runsConceded);
        System.out.println("Overs Bowled     : " + oversBowled);

        System.out.println("Strike Rate      : " + calculateStrikeRate());
        System.out.println("Batting Average  : " + calculateBattingAverage(matchesPlayed));
        System.out.println("Economy          : " + calculateEconomy());

        System.out.println("--------------------------------");
    }
}

public class Cricket
{
    public static void main(String[] args)
    {
        Cricketer player1 = new Cricketer();

        // Assigning values
        player1.playerName = "Dravid";
        player1.runsScored = 121;
        player1.ballsFaced = 54;
        player1.fours = 8;
        player1.sixes = 9;
        player1.wicketsTaken = 1;
        player1.runsConceded = 23;
        player1.oversBowled = 3.0;

        // Calling display method
        player1.displayStats(5);
    }
}