import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = input.nextInt();
            handleMenuChoice(choice);
        } while(choice != 3);
        
        input.close();
    }

    public static void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Greet User:");
        System.out.println("2. Check Even/Odd:");
        System.out.println("3. Exit:");
        System.out.println("Enter your choice (1-3):");
    }

    public static void handleMenuChoice(int choice){
        if (choice == 1){
            greetUser();
        }
        else if (choice == 2){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int num = input.nextInt();
            System.out.println(checkEvenOrOdd(num));
        }
        else if (choice == 3){
            System.out.println("Exiting program. Goodbye!");
        }
        else{
            System.out.println("Error!");

        }
    }

    public static void greetUser(){
        System.out.println("Hello! Welcome!");
    }

    public static String checkEvenOrOdd(int number){
        String type = "";

        int num = number % 2;

        if (num == 0){
            type = (number + " is an even number");
        }
        else if (num != 0){
            type = (number + " is an odd number");
        }

        return type;
    }

}