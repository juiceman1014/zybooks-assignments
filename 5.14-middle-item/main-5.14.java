import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[12];  // Set of data specified by the user

        /* Type your code here. */

        //Read all numbers into an array
        //while userValue[i] != 0
        //userValue[i] = scnr.nextInt()
        //i++

        int i = 0;
        int userInput = 0;

        while(userInput != -1){
            userInput = scnr.nextInt();
            userValues[i] = userInput;
            i++;
        }

        if(i==12){
            System.out.println("Too many numbers");
        } else {

            int[] newArray = new int[i];

            System.arraycopy(userValues, 0, newArray, 0, i);

            //arrayLength = length - 1
            int arrayLength = newArray.length - 1;
            //middleIndex = arrayLength/2
            int middleIndex = arrayLength / 2;
            //print array[middleIndex];
            System.out.print("Middle item: " + newArray[middleIndex] + "\n");
        }
    }
}
