package JavaConcepts.InnerClass.RegularClassDemos;

public class StaticNestedClass {

    public static void main(String[] args) {
        NestNesst.Nested n = new NestNesst.Nested();

        n.m();
    }
}
class NestNesst{
    static class Nested{
        public void m(){
            System.out.println("static nested class method");
        }
    }
}
