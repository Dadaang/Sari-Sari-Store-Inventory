/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarisari_store_inventory;

import java.util.Scanner;

public class SariSari_Store_Inventory {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Item name: ");
        String question1 = sc.nextLine();
        
        System.out.print("Item product code: ");
        String question2 = sc.nextLine();
        
        System.out.print("Item quantity in stock: ");
        String question3 = sc.nextLine();
        
        System.out.print("Item product price per unit: ");
        String question4 = sc.nextLine();
        
        System.out.print("Item supplier name: ");
        String question5 = sc.nextLine();
        
        System.out.print("Item expiration date: ");
        String question6 = sc.nextLine();
        
        
        System.out.print("Item product sold today: ");
        String question7 = sc.nextLine();
        
        
        System.out.print("Item discount percetage: ");
        String question8 = sc.nextLine();
        
        System.out.print("Item reorder threshold quantity" );
        String question9 = sc.nextLine();
        
        
        System.out.print("Item store location" );
        String question10 = sc.nextLine();
        
        
        System.out.println("Item name: " + question1);
        System.out.println("Item product code: " + question2);
        System.out.println("Item quantity in stock: " + question3);
        System.out.println("Item  product price per unit: " + question4);
        System.out.println("Item  supplier name: " + question5);
        System.out.println("Item  product expiration date: " + question6);
        System.out.println("Item product sold today: " + question7);
        System.out.println("Item discount percentage: " + question8);
        System.out.println("Item  reorder threshold quantity: " + question9);
        System.out.println("Item store location: " + question10);
        
        
    }
  
}