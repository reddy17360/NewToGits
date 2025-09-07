package JavaConcepts.MethodOverloading;

public class Level {
    public void m(String s){
        System.out.println("String ");
    }

    public void m(StringBuffer s){
        System.out.println("StringBuffer");
    }

    public static void  main(String [] args){
        Level level = new Level();      //                 Object
        level.m("Sanju");           //                    /\
        level.m(new StringBuffer("sanjureddy"));    //      /  \
     //  level.m(null)   ;                    // String   StringBuffer
//Here problem is both String & StringBuffer are at same level so compiler got the confusion which to take off


    }
}
