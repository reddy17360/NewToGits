package JavaConcepts.CollectionsConcept.ListDemo.ListConcepts;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfFruits {
    public static void main(String[] args){

        ArrayList cart = new ArrayList();
         int choice=0;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.println("1.Add an element to the cart");
             System.out.println("2.Remove the element to the cart");
             System.out.println("3.Search for the element in the cart");
             System.out.println("4.Display the elements in the cart");
             System.out.println("please select any one from above");
             choice = sc.nextInt();
             //sc.nextLine();
             switch (choice) {
                 case 1:
                     System.out.println("enter an item to add");
                     String item1 = sc.nextLine();
                     cart.add(item1);
                     System.out.println("an item added to the cart");
                     break;
                 case 2:
                     String item = sc.nextLine();
                     if (cart.contains(item)) {
                         cart.remove(item);
                     } else
                         System.out.println("item not found");
                     break;
                 case 3:
                     String items = sc.nextLine();
                     if (cart.contains(items)) {
                         System.out.println("yes your item is here");
                     } else
                         System.out.println("item not found");
                     break;
                 case 4:
                     System.out.println("list of your items in the cart" + cart);
                     break;

             }
         }while(choice!=5);


    }
}
