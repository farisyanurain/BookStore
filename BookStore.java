import java.util.Scanner;
import java.io.*;
//class name

class BookStore{

    public static void main(String[] args)throws IOException {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

        float[]price=new float[10];
        int quantity;
        float totalprice =0;
        String title;

        Scanner input = new Scanner(System.in);
        //user insert the input
        System.out.println("Enter the Title of the book :");
        title = input.nextLine();
        System.out.println("Please Enter the number of the book: ");
        quantity=Integer.parseInt(stdin.readLine());
        System.out.println("Enter each price  :");
        //looping

        for(int i=0; i<quantity; i++)
        {
            price[i]=input.nextInt();
        }

        for(int i=0; i<quantity; i++)
        {
            totalprice=totalprice+price[i];
        }

        System.out.println("Your total price is:RM"+ totalprice);
        System.out.println("*****************************");
        System.out.println("\tRECEIPT");
        System.out.println("\tThankYou!Please Come Again.");
    }
}