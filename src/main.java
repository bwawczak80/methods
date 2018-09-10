
import java.util.Scanner;

public class main{


    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        Scanner userInput = new Scanner(System.in);

        int userChoice;

        do {
            System.out.println("Choose which shape you want to find the area of: ");
            System.out.println("------------------------------------");
            System.out.println("1.  Circle");
            System.out.println("2.  Sphere");
            System.out.println("3.  Square");
            System.out.println("4.  Cube");

            userChoice = userInput.nextInt();
        } while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5);

        switch (userChoice) {
            case 1:

                System.out.println("What is the radius of the circle in inches?");
                int userInput1 = scan.nextInt();
                double area = calculateAreaOfCircle(userInput1);
                totalOut(area);
                break;
            case 2:
                System.out.println("What is the radius of the sphere in inches?");
                int userInput2 = scan.nextInt();
                double area2 = calculateAreaOfSphere(userInput2);
                totalOut(area2);
                break;
            case 3:
                System.out.println("What is the length of the square in inches?");
                int userInput3 = scan.nextInt();
                double area3 = calculateAreaOfSquare(userInput3);
                totalOut(area3);
                break;
            case 4:
                System.out.println("What is the length of the cube in inches?");
                int userInput4 = scan.nextInt();
                double area4 = calculateAreaOfCube(userInput4);
                totalOut(area4);
                break;

            default:
                System.out.println("That is not a valid choice.");
                break;
        }

    }

    private static double calculateAreaOfCircle(double input1){

        return 2 * Math.PI * input1;
    }

    private static double calculateAreaOfSphere(double input2){

        return 4 * Math.PI * input2 * input2;
    }

    private static double calculateAreaOfSquare(double input3){
        return input3 * input3;}

    private static double calculateAreaOfCube(double input4){
        return input4 * input4 * input4;}

    private static void totalOut(double areaOfShape){
        System.out.println("the area of your shape is: " + areaOfShape + " inches.");
    }
}

