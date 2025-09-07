package JavaConcepts.FlowControl.SwitchCase;

import java.util.Scanner;

public class HotelBill {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str){
            case "Idli"  :
                System.out.println("Idli" );

            case "Dosa" :
                System.out.println("Dosa dosa");

            case "Palav" :
                System.out.println("Palav");
            case "Puri" :
                System.out.println("Puri");
        }
    }
}
