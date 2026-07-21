import  java.util.Scanner;
public class ShopingCartProg {
    public static void  main(String[] args){
        //SHOPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);


        String item;
        double price;
        int quantatiy;
        char currancy='$';
        double totalPrice;

        System.out.print("Enetr what you want= ");
         item = scanner.nextLine();

        System.out.print("Enter the price ");
        price = scanner.nextDouble();

        System.out.print(" how much u want ");
         quantatiy = scanner.nextInt();



         totalPrice = price * quantatiy ;

        System.out.print("total amount will be "+  currancy +  totalPrice);


        scanner.close();
        }

    }
