package JavaConcepts.Variables;

public class InroVar {

    static int y = 20 ;//static variable at class level
    int x = 10 ;//instance variable at object level
    int[] n;

    public static void main(String[] args){

        int a = 100; // local variable at block/method/constructor level

//        InroVar var = new InroVar();
//        var.x=100;
//
//        var.y=200;
//        System.out.println(var.x);
//        System.out.println(var.y);
//        InroVar var2 = new InroVar();
//        System.out.println(var2.x);
//        System.out.println(var2.y);

        InroVar inroVar = new InroVar();


        System.out.println(inroVar.n);
      //  System.out.println(inroVar.n[0]);
        System.out.println(3%10);






    }
}
