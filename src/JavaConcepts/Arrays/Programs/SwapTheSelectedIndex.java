package JavaConcepts.Arrays.Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapTheSelectedIndex {
    public static void main(String[] args){
        int[] x = {10,20,30,40,50};

        for( int xx : x){
            System.out.println("Before swap" + xx);
        }

        Scanner sc = new Scanner(System.in);
         int dice1 = sc.nextInt();
         int dice2 = sc.nextInt();
         int temp = 0;
          temp = x[dice1];
         x[dice1] = x[dice2];
         x[dice2] = temp;
        for( int xx : x){
            System.out.println("After swap" + xx);
        }

    }
}
