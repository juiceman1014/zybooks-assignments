import java.util.Scanner;

public class LabProgram {

    public static void sortArray(int[] myArr, int arrSize){

        int temp = 0;
        //bubble sort
        for(int i = 0; i<arrSize; i++){
            for(int j = 1; j<arrSize - i; j++){
                if(myArr[j-1] < myArr[j]){
                    temp = myArr[j-1];
                    myArr[j-1] = myArr[j];
                    myArr[j] = temp;
                }
            }
        }


        for(int i = 0; i<arrSize; i++){
            System.out.print(myArr[i] + ",");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        //create an array
        int[] userValues = new int[20];
        //ask user for how many numbers are in the list
        Scanner scnr = new Scanner(System.in);
        int numberElements = scnr.nextInt();
        //while loop to create array
        int i = 0;
        while(i != numberElements){
            userValues[i] = scnr.nextInt();
            i++;
        }
        sortArray(userValues, numberElements);


    }
}
