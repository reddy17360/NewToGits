package JavaConcepts.MethodOverloading;

public class Parent {
    void m(String s){
        System.out.println("String version");
    }
    void m(Object o){
        System.out.println("Object version");
    }

    public static void main(String [] sanu){
        Parent parent = new Parent();
        parent.m("Durga");
        parent.m(new Object());
        parent.m(null); //Compiler always gives priority to the
        //child type argument compared to parent type arg
    }
}

