import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Fizz number: ");
        int fizz = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Buzz number: ");
        int buzz = scn.nextInt();

        System.out.println("Enter number to start play. for ending the game enter anything but number ");
        int checkNumber;


        while(true){

            try {
                checkNumber = scn.nextInt();
            } catch(InputMismatchException e){
                break;
            }


            if(checkNumber%fizz==0){
                System.out.print("Fizz");
            }
            if (checkNumber%buzz==0){
                System.out.print("Buzz");
            }
            if(checkNumber%3!=0 & checkNumber%5 != 0){
                System.out.print("No FizzBuzz");
            }


            System.out.println("\nthat's it. what's next?");
        }


        System.out.println("The Game is Over");
    }
}