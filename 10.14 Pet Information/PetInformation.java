import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Cat myCat = new Cat();

        String petName, catName, catBreed;
        int petAge, catAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        catName = scnr.nextLine();
        catAge = scnr.nextInt();
        scnr.nextLine();
        catBreed = scnr.nextLine();

        // TODO: Create generic pet (using petName, petAge) and then call printInfo
        Pet pet1 = new Pet();
        pet1.setName(petName);
        pet1.setAge(petAge);
        pet1.printInfo();


        // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
        Cat cat1 = new Cat();
        cat1.setName(catName);
        cat1.setAge(catAge);
        cat1.setBreed(catBreed);
        cat1.printInfo();


        // TODO: Use getBreed(), to output the breed of the cat
        System.out.println("   Breed: " + cat1.getBreed());

    }
}