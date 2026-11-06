import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //open  scanners to get input
        while (true) {
            // get numbers
            System.out.print("Number1: ");
            double number1 = scanner.nextDouble();
            System.out.print("Operator: ");
            String operator = scanner.next();
            System.out.print("Number2: ");
            double number2 = scanner.nextDouble();
            
            // calculate result
            double result;
            switch (operator) {
                case "+": // if operator is + add the numbers together
                    result = number1 + number2;
                    break;
                case "-": // if operator is - subtract the numbers together
                    result = number1 - number2;
                    break;
                case "*": // if operator is * multiply the numbers together
                    result = number1 * number2;
                    break;
                case "/":  // if operator is / divide the numbers together
                    if (number2 == 0) { // check for division by 0
                        System.out.println("Cannot Divide by Zero, try again!");
                        continue; // get new numbers
                    }
                    result = number1 / number2;
                    break;
                default: // defualt runs when no other options apply, this means that we do not support this operator
                    System.out.println("Invalid Operator, try again!");
                    continue; // get new numbers
            }

            System.out.println("Result is " + result); // print result
            break;
        }
        scanner.close(); // Important! close the scanner to avoid memory leaks!
    }
}
