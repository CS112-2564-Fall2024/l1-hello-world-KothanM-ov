import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        System.out.print("Please enter your age: ");

        Scanner keyboard = new Scanner(System.in);
        int age = Getage(keyboard);
        
        verifyAge(age);

        System.out.print("Choose a car color: ");
        keyboard.nextLine();
        String carColor = keyboard.nextLine();
        System.out.print("Choose a car manufacturer: ");
        String carMaker = keyboard.nextLine();

        Car car = new Car(carColor, carMaker);

        System.out.print("Choose a second car color: ");
        carColor = keyboard.nextLine();
        System.out.print("Choose a second car manufacturer: ");
         carMaker = keyboard.nextLine();
        
         Car secondCar = new Car(carColor, carMaker);
    
        System.out.println(car);
        System.out.println(secondCar);

        if (car.equals(secondCar)) {
            System.out.println("These cars are the \"same\"");
        } else {
            System.out.println("These cars are not the same");
        }

        keyboard.close();
    }

    public static int Getage(Scanner keyboard) {
        return keyboard.nextInt();
    }

    public static void verifyAge(int age) {
        int ageRequirement = 18;

        if (age >= ageRequirement) {
            System.out.println("Age meets age requirements.");
        } 
        else 
        {
            System.out.println("Age does not meet age requirements");
            System.exit(0);
        }
    }
}
