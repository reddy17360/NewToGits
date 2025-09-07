package JavaConcepts.MethodOverloading;

import java.util.ArrayList;

public class ArgTypeDiff {
//    public void m(int i , float f){
//        System.out.println("int-Float");
//    }
//
//    public void m(float f , int i){
//        System.out.println("Float-int");
//    }
  public void s(int... x){
      System.out.println("var arg method");
    }
    public void s(int x){
        System.out.println("general method");

    }
    public static void main(String[] args){
        ArgTypeDiff argTypeDiff = new ArgTypeDiff();
        //argTypeDiff.m(10, 11);
        //argTypeDiff.m(12, 13);
        int arr[]={1,2,3,4};
        int arrs[]={3,45,645};
        argTypeDiff.s(arr);

         argTypeDiff.s(arrs);

    }
}
