/**
 * write a program that plays a simple dice game between the computer and the user.when
 * the program runs, a loop should repeat 10 times.each iteration of the loop should do the
 * following:
 * Generate a random integer in the range of 1 through 6.this is the value of the
 * computers die.
 * Generate another random integer in the range of 1 through 6.THis
 * is the value of the user's die .
 *
 * The die with the highest value wins.(in case of a tie,there is no winner
 * for that particular roll of dice.)
 *
 *
 *
 */

public class DiceGame {
    public static void main(String[] args) {
        private static int numberOfGames = 10;
        int computerWins = 0, computerRoll = 0;
        int userWins = 0, userRoll = 0;
        int tiedGames = 0;
        /**
         * Method should return a number that represents a
         * side of a die in a random format.
         *
         * @return number
         */
        static int rollDie() {
            Random randValue = new Random();
            return randValue.nextInt(6) + 1;
            for (int round = 0; round < numberOfGames; round++) {

                computerRoll = rollDie();
                userRoll = rollDie();

                // determine who won the game
                if (computerRoll == userRoll) {
                    tiedGames++;
                } else {
                    if (computerRoll > userRoll) {
                        computerWins++;
                    } else {
                        userWins++;
                     // Display the results.
                        System.out.println("Computer...." + computerWins);
                        System.out.println("User........" + userWins);
                        System.out.println("Ties........" + tiedGames);
                        // Determine the grand winner.
                        if (computerWins > userWins) {
                            System.out.println("You got beat by a computer!");
                        } else {
                            if (computerWins < userWins) {
                                System.out.println("You beat the computer!");
                            } else {
                                System.out.println("The game has ended in a tie!");
                            }
                        }

                    }
                }
            }
        }
    }
}
