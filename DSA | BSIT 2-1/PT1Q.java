/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Performance Task #1 - Queue and Stack Implementation
 * Date : October 16, 2022
*/
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class PT1Q {

  public static void main(String[] args) {
    
    Queue<Integer> q_list = new LinkedList<>(); //Queue declatration
    int arr[] = new int [100]; //array declaration
   
    Scanner userIN = new Scanner(System.in); // scanner declaration

    System.out.print("Enter the size of the queue : ");
    int size = userIN.nextInt();

    System.out.println(" ");
    System.out.println(" ");
    
    //adding elements in queue
    for(int qIN = 0; qIN < size; qIN++){
        System.out.print("Enter the queue values [" + (qIN+1) + "]: ");
        arr[qIN] = userIN.nextInt();
    }

    System.out.println(" ");
    System.out.println(" ");
    
    // Printing the queue elements additively
    for (int x = 0; x < size; x++) {
        q_list.offer(arr[x] );
        System.out.println("Queue: " + q_list);
    }
    
    //removing an element from the queue
    int elim = q_list.poll();

    
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Removed Element : " + elim);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Queue after deletion : " + q_list);
    }
}