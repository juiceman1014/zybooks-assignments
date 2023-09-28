import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden){
        for(int i = 0; i < myGarden.size(); i++){
            //variable to help print plant number
            int j = i + 1;
            System.out.println("Plant " + j + " Information: ");
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String flowerName;
        String flowerCost;
        String colorOfFLowers;
        Boolean isAnnual;


        input = scnr.next();
        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            //if input == plant store as plant
            if(input.equals("plant")){
                {
                    plantName = scnr.next();
                    plantCost = scnr.next();
                    Plant userPlant = new Plant();
                    userPlant.setPlantName(plantName);
                    userPlant.setPlantCost(plantCost);
                    myGarden.add(userPlant);
                }
            }
            //if input == flower store as flower
            else if(input.equals("flower")){
                flowerName = scnr.next();
                flowerCost = scnr.next();
                isAnnual = scnr.nextBoolean();
                colorOfFLowers = scnr.next();
                Flower userFlower = new Flower();
                userFlower.setPlantName(flowerName);
                userFlower.setPlantCost(flowerCost);
                userFlower.setPlantType(isAnnual);
                userFlower.setColorOfFlowers(colorOfFLowers);
                myGarden.add(userFlower);
            }

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);

    }
}
