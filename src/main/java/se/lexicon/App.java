package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String volvo;

    public static void main(String[] args )
    {
        String firstName = "laurita";
        System.out.println(firstName);
        String lastName = "owanta";
        System.out.println(firstName + " "+ lastName);
        double  mathsScore = 43.8;
        double sciScore = 33.13;
        double result =  (mathsScore + sciScore);
        System.out.println( "score: "  +mathsScore );
        System.out.println("score2: "  +sciScore);
        System.out.println("result: "  +(mathsScore + sciScore));
        Scanner scanner = new Scanner(System.in);
        boolean isCheck = false;
        do {


            if (result <= 55) {
                System.out.println("Sorry, You did not pass");
            }
            if (result >= 70) {
                System.out.println("Hurray, You passed");
            } else {
                System.out.println("You are almost there");
                isCheck = false;
            }
        } while (isCheck);
        System.out.println("Done");

        System.out.println();
        System.out.println("......................");
//................

        String Car = volvo;
        Car volvo = new Car();
        String brand = "volvo";
        int regNum =2468;
        int speed = 250;
        String ownerName = "Test";
        System.out.println(volvo);


    }

    }
