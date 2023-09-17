import java.util.Random;

/**
 * This class represents a recursive die roller that rolls a die until a 2 shows up.
 */
public class RecDieRoller {
    Random rand = new Random();
    int count = 0;

    /**
     * This method rolls a die and returns the number of rolls it took to get a 2.
     * It uses recursion to keep rolling the die until a 2 shows up.
     *
     * @return The number of rolls it took to get a 2.
     */
    public int roll() {
        count++;
        int dieFace = rand.nextInt(6) + 1;
        if (dieFace != 2) {
            return roll();
        } else {
            int temp = count;
            count = 0; // reset count for next trial
            return temp;
        }
    }
}