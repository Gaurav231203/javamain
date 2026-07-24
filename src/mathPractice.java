import java.util.Scanner;
public class mathPractice {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

         int a;
         int b;
         double c;

        System.out.print("ebter a: ");
        a= scanner .nextInt();


        System.out.print("ebter b: ");
        b= scanner .nextInt();


        c = Math.sqrt((a*a) + (b*b));

        System.out.println("hypotenus is: " + c );




    }
}
