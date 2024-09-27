/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author kentr
 */

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        
        
          ItemManager list = new ItemManager();
          
          Scanner davram = new Scanner(System.in);
          
          
                    
                   while(true){
         System.out.println("A. Entrance");
          System.out.println("B. Insert");
          System.out.println("C. Display");
          System.out.println("D. Updated");
          System.out.println("E. find items");
          System.out.println("F. Deleted all items");
           System.out.println("G. Leave");
       
           String scan = davram.nextLine();
           
           
           if( scan.equals("A")) {
               System.out.println("Welcome Sa Among Systema");
                String Items = davram.nextLine();
                     
    
           }else if( scan.equals("B")) {
               System.out.println("What is the item that you would like to Insert?");
                String Items = davram.nextLine();
                System.out.println();
                list.insertItem( Items);
                     System.out.println();
                     
                     
           } else if( scan.equals("C")){
                     
                     list.displayItems();
                        System.out.println();
                
                if( scan.equals("D")) {
               System.out.println("What would you like to update?");
            int item = Integer.parseInt(davram.nextLine());
            
                     System.out.println(" And what is the replacement item? ");
                     String repItem = davram.nextLine();
                     list.updateItem(item, repItem);
                      System.out.println();
                      
                       } else if( scan.equals("E")){
                     
                     System.out.println("What is that you want to find? ");
                     String item = davram.nextLine();
                     list.findItem(item);
                        System.out.println();
                     
                     
                 
                 } else if( scan.equals("F")){
                     
                    System.out.println("What item would you like to be delete?");
                    list.displayItems();
                     int  index = Integer.parseInt(davram.nextLine()) ;
                     list.deleteItem(index);
                     System.out.println();
                    
                  
                        
                 } else if( scan.equals("G")){
                     
                     System.out.println("Salamat sa imong pag pili sa akoa!! ");
                    break;
                     
                
                 } else {
                     System.out.println("ByeBye");
                     
                  
                 }
                 
                 
                 
                 }
            
        
                   }
    }
}s