package JavaConcepts.Variables;

public class VarArgMethod {

    static void m(int... x){

        int sum=1;
        System.out.println("var-arg method" + x.length);
        for(int i =0 ; i<x.length ; i++){
          sum = sum * x[i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        m();
        m(10 , 20);

    }
}
