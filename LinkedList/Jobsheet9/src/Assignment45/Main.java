package Assignment45;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Customer newCustomer(){
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Address : ");
        String address = sc.nextLine();
        System.out.print("Account Number : ");
        String account = sc.nextLine();

        return new Customer(name,address,account);
    }
    public static void main(String[] args) {
         Queue q = new Queue();
         boolean exit = false;

         do {
             System.out.println("Menu : ");
             System.out.println("1. Queue");
             System.out.println("2. Dequeue");
             System.out.println("3. Print");
             System.out.println("4. Exit");
             System.out.print("Choose menu : ");
             int choice = sc.nextInt();
             sc.nextLine();

             switch (choice){
                 case 1:
                     q.enqueue(newCustomer());
                     break;
                 case 2:
                     q.dequeue();
                     break;
                 case 3:
                     q.print();
                     break;
                 case 4:
                     exit = true;
                     break;
                 default:
                     System.out.println("Input Error");
             }
         }while (exit == false);
    }
}
