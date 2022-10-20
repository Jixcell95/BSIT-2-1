/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Performance Task #1 - Queue and Stack Implementation
 * Date : October 16, 2022
*/
import java.util.Stack;
import java.util.Scanner;

public class PT1Stack {

    public static void main(String[] args) {
        int top = 0;
        int size = 0;
        
        Stack<String> my_stack = new Stack <> (); // stack declaration

        int arr[] = new int [10]; // array declaration
        boolean check = my_stack.empty(); //checks if stack is empty
        Scanner userIN = new Scanner(System.in); // scanner declaration

        System.out.print("Enter the size of the stack : ");
        size = userIN.nextInt();
        System.out.println(" ");

        System.out.print("Is the stack empty? " + check);
        System.out.println(" ");
        System.out.println(" ");

        //add elements in the array
        for(int x = 0; x < size; x++){
            System.out.print("Enter the stack values [" + (x+1) + "]: ");
            arr[x] = userIN.nextInt();
        }
       
        for (int x = 0; x < size; x++){
            my_stack.push(arr[x] + "");
        }
        
        System.out.println(" ");
        System.out.println("Elements in stack " + my_stack);
        check = my_stack.empty();

        System.out.println(" ");
        System.out.print("Is the stack empty? " + check);
        System.out.println(" ");

        String elim = my_stack.pop();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Removed Element : " + elim);
        System.out.println(" ");
        System.out.println("Stack after deletion : " + my_stack);
       
    }
}