
/**
 * Write a description of class Craps here.
 *
 * @author Benji Fernandez
 * @version 2021-1-11
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        boolean again = true;
        System.out.println("LET'S PLAY CRAPS!");
        System.out.print("Do you need instructions (Y/n)? ");
        String playGame = in.nextLine();
        if (playGame.equals("") ||
        playGame.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll,if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
        }
        System.out.println("Good Luck!");
        while (again)
        {
            int point = 0;
            System.out.println("Press <Enter> to roll the dice...");
            String pause = in.nextLine();
            System.out.println("Your first roll is: " + die.rollDie());
            if (die.getRoll() == 7)
            {
                System.out.println("You rolled a 7! You win!");
            }
            else if (die.getRoll() == 11)
            {
                System.out.println("You rolled an 11! You win!");
            }
            else if (die.getRoll() == 2)
            {
                System.out.println("You rolled a 2! You lose!");
            }
            else if (die.getRoll() == 3)
            {
                System.out.println("You rolled a 3! You lose!");
            }
            else if (die.getRoll() == 12)
            {
                System.out.println("You rolled a 12! You lose!");
            }
            else
            {
                point = die.getRoll();
                System.out.println("That's your point");
                System.out.println("Let's see if you can roll it again before you roll a 7!");
            }
            while (point != 0)
            {
                System.out.println("Press <Enter> to roll the dice...");
                pause = in.nextLine();
                System.out.println("You rolled: " + die.rollDie());
                if (die.getRoll() == point)
                {
                    System.out.println("You rolled your point! You won!");
                    break;
                }
                else if (die.getRoll() == 7)
                {
                    System.out.println("You rolled a 7! You lose!");
                    break;
                }
                else
                {
                    System.out.println("Keep rolling...");
                }

            }
            System.out.print("Play again(Y/n)?");
            String another = in.nextLine();
            if (another.equals("") ||
            another.substring(0,1).equalsIgnoreCase("y"))
            {
                again = true;
            }
            else
            {
                again = false;
            }
        }
        System.out.println("Thanks for playing!");
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is a great version of the Craps program, Benji. Nothing fancy, but you've done
a great job of implementing the requirements, especially the default "roll" and
play again" options. Well done there!

One detail I'll mention, in line 63 (if you've got line numbering turned on), you've
got a conditional loop set up to run `while point != 0`. That's a bit of a hack,
because we're not *really* looking for point to equal 0.

The *better* strategy, and a legitimate use of that `while` loop, would be to 
write it like this:

    while (newRoll != point && newRoll != 7)
    {
        .
        .
        .
    }

or if that's tricky to make happen, even this:

    boolean keepRolling = true;
    while (keepRolling)
    {
        // See what's happening, and change status of 
        // keepRolling depending on what happens
    }

A small detail. Otherwise, this is some fine work, Benji. Looking forward to
seeing some amazing things from you in our upcoming projects!!! :)

SCORE: 50/50

*/

