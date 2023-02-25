import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in meters : ");
        double height = input.nextDouble();
        System.out.println();
        System.out.print("Please enter your weight : ");
        int weight = input.nextInt();
        System.out.println();
        input.close();
        double bodyMassIndex = weight / Math.pow(height,2);
        // you can also use weight / height * height
        System.out.println("Your Body Mass Index : " + "%" + bodyMassIndex);



    }
}