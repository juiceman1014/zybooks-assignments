import java.util.Scanner;
import java.util.Random;

public class LabProgram {

    public static String coinFlip(Random rand){
        //if modulo rand.nextINt equals 1, return head
        if (rand.nextInt(2) % 2 == 1){
            return "Heads";
            //else return tail
        }else{
            return "Tails";
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Unique seed

        //number tries = user input
        int numberTries = scnr.nextInt();
        //declare i to 0
        int i = 0;
        while(i != numberTries){
            System.out.println(coinFlip(rand));
            i++;
        }
        //call coinFlip
        //print coinFlip's value
        //add one to i

    }
}
