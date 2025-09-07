package JavaConcepts.SignleTon;

public class Demp {

    public static Demp d= new Demp();

    private Demp(){

    }
   public static Demp getDemp(){

       return d;
   }
   public static void main(String[] args){

        Demp dd = Demp.getDemp();
       Demp dd1 = Demp.getDemp();

       System.out.println(d);
       System.out.println(dd);
       System.out.println(dd1);



   }



}
