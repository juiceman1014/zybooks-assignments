import java.util.Scanner;

public class LabProgram {

    public static void swapValues(int[] values){
        //swap index 0 and 1
        //int tempVal = index 0
        int tempVal = values[0];
        //index 0 = index 1
        values[0]=values[1];
        //index 1 = tempVal
        values[1]=tempVal;
        //swap index 2 and 3
        //int tempVal = index 2
        tempVal = values[2];
        //index 2 = index3
        values[2] = values[3];
        //index 2 = tempVal
        values[3] = tempVal;
        System.out.print(values[0] + " ");
        System.out.print(values[1] + " ");
        System.out.print(values[2] + " ");
        System.out.println(values[3]);



    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] values = new int[4];
        for(int i = 0; i < 4; i++){
            values[i] =scnr.nextInt();
        }
        swapValues(values);
    }
}