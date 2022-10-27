/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Performance Task #2 - Double Link List Implementation
 * Date : October 27, 2022
*/
import java.util.Scanner;

public class PT2_DLL {
    
    //Method for doubly Linked List Node
    class Node{  
        int data;  
        Node prev;  
        Node next;  

        public Node(int data) {  
            this.data = data;  
        }  
    }  

    Node hd, tl = null;      //The head & tail for the doubly linked list 

    //insertNode method adds new Node in the Double Linked List
    public void insertNode(int data) { 

        Node NN = new Node(data);   //Creates a new node  

        //If list is empty  
        if(hd == null) {  
            hd = tl = NN;       //Both head & tail will point to NN  
            hd.prev = null;     //head node previous points to null  
            tl.next = null;     //tail node next points to null since it is the last node  
        }  

        //If list has contents  
        else {  
            tl.next = NN;       //NN will be added after tail such that tail's next will point to NN  
            NN.prev = tl;       //newNode's previous will point to tail  
            tl = NN;            //newNode will become new tail  
            tl.next = null;     //As it is last node, tail's next will point to null  
        }  
    }  

    //Method display() to print out the content of Double linked list
    public void display() {  

        Node current = hd;  //Pointer to the head node  

        //If head node is empty, displays list is emmpty
        if(hd == null) {  
            System.out.println("List is empty");
            return;  
        }  

        System.out.println("Nodes of doubly linked list: ");  

        while(current != null) {  
            System.out.print(current.data + " ");   //Prints each node by incrementing the pointer.  
            current = current.next;  
        }  
    }  

    public static void main(String[] args) {  

        PT2_DLL dbList = new PT2_DLL();  
        Scanner ch = new Scanner(System.in);
        Scanner val = new Scanner(System.in);   

        dbList.display();  

        int valN = 0;
        int chN = 0;

        System.out.print("Enter list length: ");
        chN = ch.nextInt();

        while (chN != 0){
            System.out.print("Enter value add to node: ");   
            valN = val.nextInt();
            dbList.insertNode(valN);
            chN--;
        }
  
        //Displays the nodes present in the list  
        dbList.display();  
        ch.close();
        val.close();

    }  

    
}
