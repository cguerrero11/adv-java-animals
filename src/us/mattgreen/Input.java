package us.mattgreen;

import java.util.Scanner;

public class Input {
    Scanner key = new Scanner(System.in);
    char input;
    public InputTypeVerifier askAnimal(){

        boolean quit = false;
        boolean quitall = false;
        int type;
        InputTypeVerifier itv = new InputTypeVerifier();
        while (!quitall) {
//            System.out.println("What is the name of the animal?");
            System.out.println("What animal do you want to create?");
            System.out.println("What animal?\n" +
                    "A) Person\n" +
                    "B) Cat\n" +
                    "C) Dog\n" +
                    "D) Quit");
            input = key.nextLine().toUpperCase().charAt(0);
            try {
                while (!quit) {
                    System.out.println("What is their name?");
                    String name = key.nextLine();

                    switch (input) {
                        case ('A'):
                            type = 1;
                            System.out.println("How many years does " + name + " have?");
                            int age = key.nextInt();
                            //add to zoo.add() in main
                            itv.Verify(age, name, false, type);
                            quit = true;
                            break;
                        case ('B'):
                            type = 2;
                            System.out.println("How many mice has it killed?");
                            int micekilled = key.nextInt();
                            itv.Verify(micekilled, name, false, type);
                            quit = true;
                            break;
                        case ('C'):
                            type = 3;
                            System.out.println("Is " + name + " friendly?(Y/N)");
                            input = key.nextLine().charAt(0);
                            boolean friendly = input == 'Y';
                            itv.Verify(0, name, friendly, type);
                            quit = true;
                            break;
                        case ('D'):
                            quitall = true;
                            break;
                        default:
                            System.out.println("You did not type an acceptable answer.");
                    }
                    return itv;
                }


            } catch (Exception e) {
                System.out.println("You made an error occur because you didn't listen.");
            }

        }
        System.out.println("Ended the program.");
        return null;
    }


}
