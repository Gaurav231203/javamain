   import java.util.Scanner;


    public class Main{
    public static void  main(String[]args) {

        Scanner scanner = new Scanner(System.in);// main line to enter a input in javs


        System.out.print("Enter your Name : ");//will print
        String name = scanner.nextLine();//value u will put
        scanner.nextLine();
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is yor cgpa: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("are u a student (true/false)");
        Boolean isAdult = scanner.nextBoolean();
        scanner.nextLine();


        System.out.println( "Your  name is " + name);
        System.out.println( "You are  " + age  + " year old");
           System.out.println("your cgpa is: " + cgpa);

           //conditional statement for boolean value
        if(isAdult){
            System.out.println( "u are adult " );
        }
        else{
            System.out.println(" you are a minor " );
        }

        scanner.close();
    }

    }
