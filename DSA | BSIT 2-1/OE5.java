/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Outcomes Evaluation #5 - Recursion Tower of Hanoi & Fibonacci Sequence
 * Date : October 27, 2022
*/
import java.util.Scanner;

public class OE5 {

    //Method for Tower of Hanoi Recursion implementaion
    public static String hanoi (int nDisks, int fromPeg, int toPeg){
        if(nDisks == 1){
            return "Top disk on Peg " + fromPeg + " -> Peg " + toPeg + ";";
        }
        else{
            String sol1, sol2, sol3;
            int helpPeg = 6 - fromPeg - toPeg; //calculates the help peg or auxillary peg

            sol1 = hanoi(nDisks - 1, fromPeg, helpPeg);
            sol2 = "Top disk on Peg " + fromPeg + " -> Peg " + toPeg + ";";
            sol3 = hanoi (nDisks - 1, helpPeg, toPeg);

            return sol1 + sol2 + sol3; 
        }
    }

    //Method for Fibonacci Recursion implementaion
    public static Integer fibonacci (int num){

        if (num == 0){  //Returns 0 if the num is == 0
            return 0;
        }

        else if (num == 1 || num == 2) {    //Returns 1 if the num is == 1 or 2
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2); //Fn = Fn-1 + Fn-2 
    }

    public static void main (String[] Args){
        //Menu to choose recursion implementation
        System.out.println("Choose what recursion implementation to execute:  ");
        System.out.println("[1] Tower of Hanoi Recursion ");
        System.out.println("[2] Fibonnaci Series Recursion ");
        System.out.print("Choice:  ");

        int choice = 0;
        Scanner ch = new Scanner(System.in);
        choice = ch.nextInt();

        //IF choice Tower of Hanoi
        if (choice == 1){
            int nDisks = 0;
            System.out.print("Enter number of disks: ");

            Scanner ds = new Scanner(System.in);
            nDisks = ds.nextInt();

            String StepsToSolution = hanoi(nDisks, 1, 3); //hanoi() method call

            System.out.println("Step by step solution/process: ");
            System.out.println("Source Peg - Peg 1 ");
            System.out.println("Destination Peg - Peg 3 ");


            for(String step : StepsToSolution.split(";")){  //Print out of step by step solution
                System.out.println(step);
            }

            ds.close();
        }

        //IF choice Fibonacci sequence
        else if (choice == 2){
            int numFB = 0;
            System.out.print("Enter number of iterations for Fibonacci Series: ");
            Scanner fb = new Scanner(System.in);
            numFB = fb.nextInt();

            System.out.println("Fibonacci Series up to [" + numFB + "] iterations: ");
            for (int i = 0; i < numFB; i++){    //Prints out the fibonacci sequence
                System.out.print(fibonacci(i) + " ");
            }

            fb.close();
        }

        else {  //If the choice isn't 1 or 2, program prints Invalid input and stops
        System.out.println("Invalid Input");
        }

        ch.close();
    }

}
