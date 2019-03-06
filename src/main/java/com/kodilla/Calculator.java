import java.util.*;

class Calculator {
    public void someMethod() {
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.someMethod();

                double inInt1;
                double inInt2;
                String result;

                Scanner in = new Scanner(System.in);

                System.out.println("please enter the first number:");
                inInt1 = in.nextDouble();

                System.out.println("please enter the second number:");
                inInt2 = in.nextDouble();

                Scanner re = new Scanner(System.in);
                System.out.println("Please enter operation: + or - ");
                result = re.next();

                if (result.equals("+")) {
                    System.out.println("your answer is = " + (inInt1 + inInt2));
                } else if (result.equals("-")) {
                    System.out.println("your answer is = " + (inInt1 + inInt2));
                }else {
                    System.out.println("!!! Add correct parameter '+' or '-' !!!");

        }
    }
}