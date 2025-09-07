package JavaConcepts.FlowControl.SwitchCase;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String args[]){
        Scanner arg1 = new Scanner(System.in);
        Scanner arg2 = new Scanner(System.in);
        int v1 = arg1.nextInt();
        Scanner  arithmeticOperator = new Scanner(System.in);
        String symbol = arithmeticOperator.next();
        int v2 = arg2.nextInt();

        switch (symbol)
        {
            case "+" :
                System.out.println("Sum is " + ( v1 + v2) );
                break;
            case "-" :
                System.out.println("Substraction is " +  (v1 - v2) );
                break;
            case "*" :
                System.out.println("Multiple is " + (v1 * v2)) ;
                break;
            case "/" :
                System.out.println("Division is " + (v1 / v2));
                break;
            default:
                System.out.println("Please enter valid AO");


        }


    }
}
