

import java.util.Scanner;

public class madlib {
    public static  void  main(){
        Scanner scanner = new Scanner(System.in);


        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3 ;

        System.out.println(" Enter a adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (about a person,thing or palce ) ");
        noun1 = scanner.nextLine();
        System.out.println("Enter adjective (more description)");
        adjective2 = scanner.nextLine();
        System.out.println("Enter verb  ( action )");
        verb1 = scanner.nextLine();
        System.out.println("Enter adjective (more description)");
        adjective3 = scanner.nextLine();





        System.out.println("i went to a " + adjective1 + " zoo");
        System.out.println("there i saw a " + noun1 + " he was in cage");
        System.out.println( noun1  +  " was  " + adjective2 + " and " + verb1 + " !");
        System.out.println("i was " + adjective3 + " !");

        scanner.close();
    }


}
