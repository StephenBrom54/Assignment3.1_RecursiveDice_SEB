/**
 * This class contains the main method that creates an instance of RecDieRoller and starts it by calling the roll method.
 * It runs the roll method 1,000 times and calculates the mean number of rolls it takes to get a 2.
 */
public class RecDieRollerDriver {
    public static void main(String[] args) {
        RecDieRoller roller = new RecDieRoller();
        int totalRolls = 0;
        int trials = 1000;

        for (int i = 0; i < trials; i++) {
            totalRolls += roller.roll();
        }

        double meanRolls = (double) totalRolls / trials;
        System.out.println("Mean number of rolls to get a 2: " + meanRolls);
    }
}