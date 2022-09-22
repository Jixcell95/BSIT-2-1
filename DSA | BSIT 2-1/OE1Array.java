/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Outcomes Evaluation # 1 - Arrays
 * Date : September 22, 2022
*/
import java.util.Scanner;

public class OE1Array{

    //Array sorting method
    static void sorting(int size, int arr[]){
        for (int i = 0; i < size; i++) {  
            for (int j = i + 1; j < size; j++) {  
                int tmp = 0;  
                if (arr[i] > arr[j]) {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }
            System.out.println(" [" + (i+1) + "] " + arr[i]);
        }
    }

    //Array sum method
    static void arraysum (int size, int arr[]){
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        System.out.print(sum);
        System.out.println( " ");

    }

    //Array highest element method
    static void highest (int size, int arr[]){
        int HghN = 0;
        for (int i = 0; i < size; i++){
            int tmp = arr[i];
            if (HghN < tmp){
                HghN = tmp;
            }
            else {
                HghN = HghN;
            }
        }
        System.out.print(HghN);
        System.out.println( " ");
    }

    //Array lowest element method
    static void lowest(int size, int arr[]){
        int LwN = 0;
        for (int i = 0; i < size; i++){
            LwN = arr[0];
            int tmp = arr[i];
            if (tmp < LwN){
                LwN = tmp;
            }
        }
        System.out.print(LwN);
        System.out.println( " ");
    }

    public static void main (String[] args) {

        int arr[] = new int[100]; // array name: arr, size: 10
        
        Scanner n = new Scanner(System.in);

        //Array range
        System.out.println( " ");
        System.out.print("Enter array size: ");
        int size =n.nextInt();
        System.out.println( " ");

        //Array element insertion
        for (int x = 0; x < size; x++ ) {
            System.out.print("Enter element [" + (x+1) + "] value: ");
            arr[x] = n.nextInt();
        }

        //Array display
        System.out.println( " ");
        System.out.println( "Unsorted array elements: ");
        for (int o = 0; o < size; o++) {
            System.out.println(" ["+ (o + 1) + "] " + arr[o]);
        }

        //Array Ascending Sorting
        System.out.println( " ");
        System.out.println( "Sorted in ascending order array elements: ");
        sorting(size, arr);

        //Array sum output
        System.out.println( " ");
        System.out.println( "Sum of Array Elements: ");
        arraysum(size, arr);

        //Array Highest element
        System.out.println( " ");
        System.out.println( "Highest Element in the Array: ");
        highest(size, arr);
        
        //Array Lowest Element
        System.out.println( " ");
        System.out.println( "Lowest Element in the Array: ");
        lowest(size, arr);   
    }
}
