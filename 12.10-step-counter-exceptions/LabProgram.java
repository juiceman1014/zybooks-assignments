import java.util.Scanner;

public class LabProgram{

    public static double stepsToMiles(int steps) throws Exception{
        if(steps < 0){
            throw new Exception("Exception: Negative step count entered.");
        }
        return (double)steps/2000;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            int userSteps = scnr.nextInt();
            System.out.printf("%.2f", stepsToMiles(userSteps));
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
