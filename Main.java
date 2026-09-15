import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = scanner.nextLine();

        Character character = new Character(name);

        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\n---");
            System.out.println("character: " + character.getName());
            System.out.println("level: " + character.getState().getLevelName());
            System.out.println("experience: " + character.getExperiencePoints());
            System.out.println("health: " + character.getHealthPoints());
            System.out.println("---");

            if (character.getState() instanceof MasterState) {
                System.out.println("game over. you win");
                break;
            }

            if (character.getHealthPoints() <= 0) {
                System.out.println("You died :(");
                break;
            }

            System.out.println("actions:");

            if (character.getState() instanceof NoviceState) {
                System.out.println("1. train");
            } else if (character.getState() instanceof IntermediateState) {
                System.out.println("1. train");
                System.out.println("2. meditate");
            } else if (character.getState() instanceof ExpertState) {
                System.out.println("1. train");
                System.out.println("2. meditate");
                System.out.println("3. fight");
            }

            System.out.println("0. quit");
            System.out.print("> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    character.train();
                    break;

                case "2":
                    character.meditate();
                    break;

                case "3":
                    character.fight();
                    break;

                case "0":
                    gameRunning = false;
                    System.out.println("game ended");
                    break;

                default:
                    System.out.println("invalid");
            }
        }

        scanner.close();
    }
}