package JavaConcepts.MethodOverloading;

public class Test {
    void m1(){

    }
    void m1(float i){
        System.out.println("automatic promotion");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.m1();
        t.m1(99);//automatic promotion

    }
}
