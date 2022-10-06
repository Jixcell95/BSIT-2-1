
/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Outcomes Evaluation # 4 - Bubble Sort & Insertion
 * Date : October 6, 2022
*/

import java.util.Scanner;

public class OE4Bubble_Insert_Sort{
    
    //Bubble Sort Method
    static void bubbleSort (int[] un_list){
        int ctr = un_list.length; // n times of un_list array
        int tmp = 0;
        int icount = 0;

        for (int x = 0; x < ctr; x++){
            for (int y = 1; y < (ctr-x); y++){
                //System.out.println("Elemenets [ " + un_list[y-1] + " , " + un_list[y] + " ]");
                if (un_list[y-1] > un_list[y]){
                    tmp = un_list[y-1];
                    un_list[y-1] = un_list[y];
                    un_list[y] = tmp;
                }
                icount++;
            }
            
        }
        System.out.println("Buble Sort Number of iteration: " + icount);
    }

    //Insertion Sort Method
    static void insertionSort(int[] un_arr){
        int ctr = un_arr.length; // n times of un_arr array
        int icount = 0;

        for(int x = 0; x < ctr; x++){
            int k = un_arr[x]; // k is value to insert
            int y = x - 1; // y is hole position

            while ((y > (-1)) && (un_arr[y] > k)) {
                un_arr[y+1] = un_arr[y];
                icount++;
                y--;
            }
            un_arr[y+1] = k;
            icount++;
        }
        System.out.println("Insertion Sort Number of iteration: " + icount);
    }
    

    public static void main (String[] args) {

        int size = 0;
        
        Scanner n = new Scanner(System.in);

        //Array Size
        System.out.println( " ");
        System.out.print("Enter array size: ");
        size = n.nextInt();
        System.out.println( " ");

        int arr[] = new int[size]; // array name: arr, size: 10

        //Array element input
        for (int x = 0; x < size; x++ ) {
            System.out.print("Enter element [" + (x+1) + "] value: ");
            arr[x] = n.nextInt();
        }


        //Unsorted Array Print
        System.out.println( " ");
        System.out.println( "Unsorted array elements: ");
        for (int x = 0; x < arr.length; x++) {
            System.out.println(" ["+ (x + 1) + "] " + arr[x]);
        }

        //Bubble Sort
        System.out.println( " ");
        bubbleSort(arr);
        System.out.println("Sorted Array List (Bubble) : ");
        for(int x = 0; x < arr.length; x++){
            System.out.println(" ["+ (x + 1) + "] " + arr[x]);
        }        
        System.out.println( " ");

        //Insertion Sort
        System.out.println( " ");
        insertionSort(arr);
        System.out.println("Sorted Array List (Insertion) : ");
        for(int x = 0; x < arr.length; x++){
            System.out.println(" ["+ (x + 1) + "] " + arr[x]);
        }        
        System.out.println( " ");
        System.out.println( " ");

    }
}
