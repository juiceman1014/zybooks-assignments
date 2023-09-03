import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scnr.nextInt();   // Input begins with number of integers that follow


        /* Type your code here. */
        userList = new int[numElements];

        //read all inputted numbers into an array
        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.nextInt();
        }


        for (int i = userList.length - 1; i >= 0; i--){
            System.out.print(userList[i] + ",");
        }

        System.out.print("\n");
        //print out the that array index

    }
}