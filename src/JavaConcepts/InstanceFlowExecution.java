package JavaConcepts;

import java.security.PublicKey;

public class InstanceFlowExecution {
    int x=10;
    {
        m1();
        System.out.println("First instance blcok");
    }
    public static void main(String args[]){
        InstanceFlowExecution i = new InstanceFlowExecution();
        System.out.println("main");
    }
    public void m1(){
        System.out.println(j);
    }
    InstanceFlowExecution(){
        System.out.println("Constructors");
    }
    {
        System.out.println("second instance block");
    }
    int j=0;
}
