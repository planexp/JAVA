import java.util.Scanner;

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

        result = dzialanie();

        if (result.equals("+")) {
            System.out.println("your answer is = " + (inInt1 + inInt2));
        } else if (result.equals("-")) {
            System.out.println("your answer is = " + (inInt1 - inInt2));

        }
    }

    public static String dzialanie() {
        Scanner re = new Scanner(System.in);
        System.out.println("Please enter operation: + or - ");
        String result = re.next();

        if (result.equals("+") || result.equals("-")) {
            return result;
        } else {
            return dzialanie();
        }
    }
}