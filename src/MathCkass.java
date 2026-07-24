import  java.util.Scanner;

public class MathCkass {
    public static  void main(String[] args){


        System.out.println(Math.PI);


        double Result;
         Result = Math.pow(4,4);// pow refers to the power 4* 4* 4 * 4  will be
        System.out.println("power of 4 time 4 is "+ Result);

        int absolutValue;
        absolutValue = Math.abs(-55); // abs is used for the absolute value ofa number
        System.out.println("absoute value of a number is "  + absolutValue);

        double squareRoot;
        squareRoot = Math.sqrt(  256 );// sqrt is used for the square root of the number
        System.out.println(squareRoot);

        double roundNumb;
        roundNumb = Math.round(6.99);// IT TELLS that the decimal number is close to wich number
        System.out.println("closest to an numebr " + roundNumb);

        double ceilNumb;
        ceilNumb = Math.ceil(7.99);// IT TELLS that the decimal number is close to wich number work same as round numb
        //always gose for upper number
        System.out.println("closest to an numebr " + ceilNumb);

        double floorNUM;
        floorNUM= Math.floor(5.99);//gose for lower  whole number
        System.out.println("lower number is== " + floorNUM);



        double maxNUM;
        maxNUM= Math.max(50.00 , 50.99);//tellss which is max mumber
        System.out.println("max number is== " + maxNUM);


        double minNUM;
        minNUM= Math.min(50.00 , 50.99);//tells which is min number
        System.out.println("min number is== " + minNUM);



    }
}
