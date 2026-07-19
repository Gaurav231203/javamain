 import java.util.Scanner;

public class rectange {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the height of the rectangle : ");

        double height= scanner.nextDouble();

        System.out.print("eneter the width of the rectangle : ");

        double widht= scanner.nextDouble();

        double totalArea= height * widht ;


        System.out.print("the totl Area of the rectangele is : " + totalArea);



        scanner.close();
    }


}
