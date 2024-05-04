package simpleCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welecome to calculator");
        boolean game = true;

        while(game){
            System.out.println();
            System.out.println("Choose one operation \n 1.Add \n 2.Substract \n 3.Exit\n");
            int  operation = scanner.nextInt();
            if(operation ==3){
                System.out.println("Bye bye then");
                break;
            }
            System.out.println("give two numbers on two lines");
            System.out.print("Number 1 is: ");
            Double num1 = scanner.nextDouble();
            System.out.print("Number 2 is: ");
            Double num2 = scanner.nextDouble();
            if(operation == 1){
                System.out.println("The sum is: "+(num1+num2));

            }else{
                System.out.println("The difference is: "+(num1-num2));
            }
        }
    }
}
