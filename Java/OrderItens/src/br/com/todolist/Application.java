package br.com.todolist;

import br.com.todolist.Client.Client;
import br.com.todolist.OrderStatus.OrderStatus;
import br.com.todolist.Product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p = new Product("TV", 1000.0);


        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = new Date();

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");


        System.out.println("How many items to this order: ");
        int n = scan.nextInt();

        for (int i = 0; i<= n; i++){
            System.out.println("Enter #"+ i+1 +" item data: ");
            System.out.println("Product name: ");

        }
    }
}
