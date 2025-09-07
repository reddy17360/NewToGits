package JavaConcepts.FlowControl.SwitchCase;

import java.awt.*;
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int by =sc.nextInt();
        switch (by){
            case 10 :
                System.out.println("im a");
                break;
            case 100 :
                System.out.println("im b");
                break;
            default :
                System.out.println("nan yaru");
        }
    }
}
