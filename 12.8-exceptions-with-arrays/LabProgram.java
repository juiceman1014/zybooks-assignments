import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
        int index;

        index = scnr.nextInt();

        try{
            System.out.println("Name: " + names[index]);
            if(index < 0){
                throw new Exception("Index " + index + " out of bounds for length 10");
            }else if(index > 9){
                throw new Exception("Index " + index + " out of bounds for length 10");

            }
        }
        catch(Exception excpt){
            System.out.println("Exception! " + excpt.getMessage());
        }

        if(index < 0){
            System.out.println("The closest name is: " + names[0]);
        }else if(index > 9){
            System.out.println("The closest name is: " + names[9]);
        }

    }
}
