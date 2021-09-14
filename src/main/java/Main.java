import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        int sex = scanner.nextInt();
        double r = 0;
        if(sex == 1){
            r = 0.73;
        }
        if(sex == 2){
            r = 0.66;
        }

        System.out.println("How many ounces of alcohol did you have?");
        int A = scanner.nextInt();
        System.out.println("What is your weight, in pounds?");
        int W = scanner.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        int H = scanner.nextInt();
        double BAC = (A * 5.14 / W * r) - .015 * H;
        System.out.println("Your BAC is "+(String.format("%.6f", BAC)));
        if(BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }
        if(BAC < 0.08){
            System.out.println("It is legal for you to drive.");
        }

    }
}
