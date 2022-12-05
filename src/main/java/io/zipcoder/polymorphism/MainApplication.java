package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        int numberOfPets;

        System.out.println("How many pets do you take care of?");
        Scanner in = new Scanner(System.in);
        numberOfPets = in.nextInt();
        Pet[] pets = new Pet[numberOfPets];
        for(int i = 0; i < numberOfPets; i ++) {
            System.out.println("What is pet #" + (i + 1) + "'s type?");
            String petType = in.next().toLowerCase();
            String petName;
            switch(petType) {
                case "dog":
                    System.out.println("What's your dog's name?");
                    petName = in.next();
                    pets[i] = new Dog(petName);
                    break;
                case "cat":
                    System.out.println("What's your cat's name?");
                    petName = in.next();
                    pets[i] = new Cat(petName);
                    break;
                case "fox":
                    System.out.println("How did you get a fox? isn't that Illegal? Nevermind. What's it's Name?");
                    petName = in.next();
                    pets[i] = new Fox(petName);
                    break;
                default:
                    i--;
                    break;
            }
        }
        for(Pet pet: pets)
            System.out.println(pet);

    }
}
