/* Name: John Carlo P. Surabasquez
 * Section : BSIT 2-1
 * Actvity: Performance Task #4 - Case Study Binary Tree & Traversals
 * Date : December 15, 2022
*/
import java.util.Scanner;

class Node {
    int data;      
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class PT4{
    //Main Method
    public static void main(String[] args) throws Exception{

        //Calls Loadscreen
        loadScreen();

        //Performs the Menu method atleast once
        do{
            Menu();
            break;
        }
        while(true);
    }

    //Method class Menu
    public static void Menu() throws Exception{
        Scanner ch = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner chin = new Scanner(System.in);

        //Opening Menu asking if the user wants to read the instruction of the app
        clearScreen();
        System.out.println("================================================");
        System.out.println("       --+       B1N4RY TR33         +--- ");
        System.out.println("       --+    TR4VERS4L APP V0.1     +--- ");
        System.out.println("================================================");
        Thread.sleep(1000);
        System.out.println(" ");
        System.out.println("Do you want to read the instructions?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.println(" ");
        System.out.print("[Choice]: ");
        int ch2 = in.nextInt();

        //OPT 1 = Prints App instructions
        if(ch2 == 1){
            clearScreen();
            System.out.println("================================================");
            System.out.println("       --+       B1N4RY TR33         +--- ");
            System.out.println("       --+    TR4VERS4L APP V0.1     +--- ");
            System.out.println("================================================");
            Thread.sleep(1000);
            System.out.println("                 [INSTRUCTI0NS]");
            System.out.println("================================================");
            System.out.println("This app demonstrates the implementation of");
            System.out.println("binary trees in Java. You will be greeted with a");
            System.out.println("menu upon use and asked to choose between");
            System.out.println("[1] Pre-order, [2] In-order, and [3] Post-order");
            System.out.println("Traversals...");
            System.out.println(" ");
            Thread.sleep(3000);
            System.out.println("Afterwhich, you will be asked to customize your");
            System.out.println("binary tree, particularly the key values of the");
            System.out.println("nodes. You will be able to see its content upon");
            System.out.println("input with the figure of the binary tree itself");
            System.out.println("with max of 2 levels [0-2]...");
            System.out.println(" ");
            Thread.sleep(3000);
            System.out.println("At the very end of this app, the binary keys ");
            System.out.println("will be printed out and the binary tree figure.");
            System.out.println("An option will then be prompted to the user to");
            System.out.println("either Go back to the menu or exit the app...");
            System.out.println(" ");
            Thread.sleep(2000);
            System.out.println("  That is all for this instruction and hopefully");
            System.out.println("             you enjoy the app! ^-^ ");
            System.out.println("================================================");
            System.out.print("[1] Go Back <--");
            int ch3 = in.nextInt();
            Menu();
        }

        //Prints the Main Menu of the app
        clearScreen();
        System.out.println("================================================");
        System.out.println("       --+       B1N4RY TR33         +--- ");
        System.out.println("       --+    TR4VERS4L APP V0.1     +--- ");
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("Please choose the desired Traversal ");
        System.out.println("[1] Pre-order");
        System.out.println("[2] In-order");
        System.out.println("[3] Post-order");
        System.out.println("[4] Exit App");
        System.out.println(" ");
        System.out.println("================================================");
        System.out.println(" ");
        System.out.print("[Select Option]: ");
        int chN = ch.nextInt();

        //[1] Pre-order choice
        if (chN == 1){
            Node uinput = uinput();         //New node input
            System.out.println(" ");
            System.out.print("[Pre-order keys]: ");
            preorder(uinput);               //method call of 'preorder' with uinput method as data
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("================================================");
            System.out.println("What would like to do? ");
            System.out.println("[1] Go Back to Menu");
            System.out.println("[2] Exit the App");
            System.out.println(" ");
            System.out.print("[Select Option]: ");
            int CHin = chin.nextInt();
            System.out.println(" ");
            System.out.println("================================================");
            if (CHin == 1){
                Menu();     //recursive call to Menu
            }
            else{
                closeSCreen();  //proceeds to exit screen
            }
            
        }

        //[2] In-order choice
        else if(chN == 2){
            Node uinput = uinput();
            System.out.println(" ");
            System.out.print("[In-order keys]: ");
            inorder(uinput);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("================================================");
            System.out.println("What would like to do? ");
            System.out.println("[1] Go Back to Menu");
            System.out.println("[2] Exit the App");
            System.out.println(" ");
            System.out.print("[Select Option]: ");
            int CHin = chin.nextInt();
            System.out.println(" ");
            System.out.println("================================================");
            if (CHin == 1){
                Menu();
            }
            else{
                closeSCreen();
            }
        }

        //[3] Post-order path
        else if (chN == 3){
            Node uinput = uinput();
            System.out.println(" ");
            System.out.print("[Post-order keys]: ");
            postorder(uinput);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("================================================");
            System.out.println("What would like to do? ");
            System.out.println("[1] Go Back to Menu");
            System.out.println("[2] Exit the App");
            System.out.println(" ");
            System.out.print("[Select Option]: ");
            int CHin = chin.nextInt();
            System.out.println(" ");
            System.out.println("================================================");
            if (CHin == 1){
                Menu();
            }
            else{
                closeSCreen();
            }
        }

        //[4] & other inputs proceeds the app to close
        else{
            closeSCreen();
        }
    }

    // method to clear console screen
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    //method for preorder traversal
    public static void preorder(Node n){
        if (n == null){ //preorder stops if n is null
            return;
        }
        System.out.print(n.data + " -> ");  //FIRST prints out root or parent node
        preorder(n.left);                   //SECOND is left node or subtree
        preorder(n.right);                  //THIRD is right node or subtree
    }

    //method for inorder traversal
    public static void inorder(Node n){
        if (n == null){
            return;
        }
        inorder(n.left);                    //FIRST prints out left node or subtree 
        System.out.print(+n.data + " -> "); //SECOND is root or parent node
        inorder(n.right);                   //THIRD is right node or subtree
    }

    public static void postorder(Node n){
        if (n == null){
            return;
        }
        postorder(n.left);                  //FIRST prints out left node or subtree 
        postorder(n.right);                 //SECOND the right node or subtree
        System.out.print(n.data + " -> ");  //THIRD is the root or parent node
    }

    //Method for data input
    public static Node uinput() throws InterruptedException{
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("       --+       B1N4RY TR33         +--- ");
        System.out.println("       --+    TR4VERS4L APP V0.1     +--- ");
        System.out.println("================================================");
        Thread.sleep(1000);        
        System.out.println(" ");

       
        System.out.print("Enter the value of the root node: ");                         // prompts user to enter N node then 
        int root = input.nextInt();                                                       // prints out a premade binary tree and 
        System.out.println("________________________________________________");        // builds up on it till 2 levels
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);                         //<---- Root node, Level 0
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of the left child: ");
        int childLeft = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               ");           //<----- Left Node, Level 1
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of the right child: ");
        int childRight = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               " + childRight);  //<---- Right Child, Level 1
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of left subtree, left child: ");
        int LSleftleaf = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               " + childRight);
        System.out.println("                 .   .           .   .");
        System.out.println("               .       .       .       .");
        System.out.println("Level 2 -->   "+ LSleftleaf + "         " + "     " + "         "); //<----- Left Child, Left Subtree, Level 2
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of left subtree, right child: ");
        int LSrightleaf = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               " + childRight);
        System.out.println("                 .   .           .   .");
        System.out.println("               .       .       .       .");
        System.out.println("Level 2 -->   "+ LSleftleaf + "         " + LSrightleaf + "     " + "         ");  //<---- Right Child, Left Subtree, Level 2 
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of right subtree, left child: ");
        int RSleftleaf = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               " + childRight);
        System.out.println("                 .   .           .   .");
        System.out.println("               .       .       .       .");
        System.out.println("Level 2 -->   "+ LSleftleaf + "         " + LSrightleaf + "     " +RSleftleaf+ "         "); //<---- Left Child, Right Subtree, Level 2
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        System.out.print("Enter the value of right subtree, right child: ");
        int RSrightleaf = input.nextInt();
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("[Binary Tree] ");
        System.out.println(" ");
        System.out.println("Level 0 -->                " + root);
        System.out.println("                        .     .");
        System.out.println("                     .           .");
        System.out.println("Level 1 -->        "+ childLeft + "               " + childRight);
        System.out.println("                 .   .           .   .");
        System.out.println("               .       .       .       .");
        System.out.println("Level 2 -->   "+ LSleftleaf + "         " + LSrightleaf + "     " +RSleftleaf+ "         " + RSrightleaf); //<---- Right Child, Right Subtree, Level 2
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================================================");

        //Creates new node for each user input respective value
        Node a = new Node(root);
        Node b = new Node(childLeft);
        Node c = new Node(childRight);
        Node d = new Node(LSleftleaf);
        Node e = new Node(LSrightleaf);
        Node f = new Node(RSleftleaf);
        Node g = new Node(RSrightleaf);

        //statically assigns level 1 - 2 node positions, either left or right child
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        //returns root node
        return a;

    }
    
    //method for Loading Screen
    public static void loadScreen() throws Exception{
        clearScreen();
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 ._.____________    +--- ");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 >.<____________    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 ___0o0_________    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 ______>.<______    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 _________0o0___    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("      ---+  L0AD1N6 ____________>.<    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("              ---+  WELCOME +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();
    }

    //Method for Closing Screen
    public static void closeSCreen() throws Exception{
        clearScreen();
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN ____________>.<    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN _________0o0___    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN ______>.<______    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN ___0o0_________    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN >.<____________    +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();
        
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("   ---+  SHUTTING DOWN ._.____________    +--- ");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("        ---+  THANK YOU & GOODBYE! +---");
        System.out.println(" ");
        System.out.println("================================================");
        Thread.sleep(1000);
        clearScreen();

        return;
    }
}
