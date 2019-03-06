import java.util.*;

class Calculator {
    public void someMethod(){

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.someMethod();

        int inInt1;
        int inInt2;
        String result;

        Scanner in = new Scanner(System.in);

        System.out.println("please enter the first number:");
        inInt1 = in.nextInt();

        System.out.println("please enter the second number:");
        inInt2 = in.nextInt();

        Scanner re = new Scanner(System.in);
        System.out.println("Please enter operation: +  or - ");
        result = re.next();

        if (result.equals("+")) {
            System.out.println("your answer is = " + (inInt1 + inInt2));
        }else if (result.equals("-")) {
            System.out.println("your answer is = " + (inInt1 + inInt2));

        }
    }
}