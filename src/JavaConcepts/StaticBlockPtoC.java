package JavaConcepts;

class StaticBlockPtoC extends  B{
    static int x=10;
    static{
        System.out.println("child1 static block" +x);
    }
    public static void main(String[] args){
        System.out.println("child main");
    }
    static int y=10;
    static{
        System.out.println("child2 static block b" +y);
    }
}
class B {
    static int xx=10;
    static{
        System.out.println("parent1 static block" + xx);
    }
    public static void main(String[] args){
        System.out.println("parent main");
    }
    static int yy=10;
    static{
        System.out.println("parent2 static block b" + yy);
    }
}

