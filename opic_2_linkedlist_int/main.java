import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Linkedlist list = new Linkedlist();

        Scanner sc = new Scanner(System.in);
        
        // Adding elements to the list
        System.out.println("Enter 5 Elements: ");
        int itm1 = sc.nextInt();
         int itm2 = sc.nextInt();
          int itm3 = sc.nextInt();
           int itm4 = sc.nextInt();
            int itm5 = sc.nextInt();
        list.add(itm1);
        list.add(itm2);
        list.add(itm3);
        list.add(itm4);
        list.add(itm5);
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 2 from the list...");
        System.out.println("Current Linked List:");
        System.out.println("Enter you want to delete: ");
        int itm6 = sc.nextInt();
       
        list.deleteByValue(itm6);
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        System.out.println("Enter you want to swap: ");
         int itm7 = sc.nextInt();
          int itm8 = sc.nextInt();
        list.moveNodePointer(itm7, itm8);
        list.printList();
	}
}
