/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Outcomes Evaluation # 7 - Quicksort
 * Date : November 10, 2022
*/
import java.util.Arrays;
import java.util.Scanner;

public class Quicksort{

    //partition method
    static int partition (int array[], int low, int high){

        int pivot = array[high]; //pivot value
        int xPtr = (low - 1); // pointer for the right most element

        for (int i = low; i < high; i++){
            if (array[i] <= pivot){
                xPtr++;
                int temp = array [xPtr];
                array[xPtr] = array [i];
                array[i] = temp;
            }
        }
        
        //swap the pivot element pointed by xPtr
        int temp = array[xPtr + 1];
        array[xPtr + 1] = array[high];
        array[high] = temp;

        return (xPtr + 1);
    }

    //quicksort method
    static void quicksort(int array[], int low, int high){
        if(low < high){ // <= -1 (Base Case)
            int pi = partition(array, low ,high); // finds the pivot element smaller or greater than the pivot
            quicksort(array, low, pi - 1); // recursive call of quicksort for left partition
            quicksort(array, pi + 1, high); // recursive call of quicksort for right partion
        }
    }

    public static void main(String [] args){

        int size;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the array size: ");
        size = input.nextInt();

        int[] num = new int[size];
        
        System.out.print("Please enter the array: ");
        for (int i = 0; i < size; i++){
            num[i] = input.nextInt();
        }

        input.close();
        size = num.length;

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(num));

        Quicksort.quicksort(num, 0, size - 1); // quicksort function call
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(num));
    }
}