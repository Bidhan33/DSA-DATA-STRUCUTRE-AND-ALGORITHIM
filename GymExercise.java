package Demo;
import java.util.Scanner;

public class GymExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the number of days with gym visits per year:");
        int year = Integer.parseInt(scanner.nextLine()); 
        System.out.println("Enter the price for a day pass:");
        double day = scanner.nextDouble(); 

        System.out.println("Enter the yearly membership fee:");
        double f1 = scanner.nextDouble(); 

        
        double totalDayPassCost = day * year;

        
        if (totalDayPassCost < f1) {
            double difference = f1 - totalDayPassCost;
            System.out.println();
            System.out.printf("Buying day passes is %.2f euros cheaper.%n", difference);
        } else if (f1 < totalDayPassCost) {
            double difference = totalDayPassCost - f1;
            System.out.printf("Paying the yearly membership fee is %.2f euros cheaper.%n", difference);
        } else {
            System.out.println("There is no difference in the yearly cost.");
        }

        scanner.close();
    }
}
