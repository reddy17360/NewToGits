package JavaConcepts.ExceptionHandling;

public class TryWilhXleCatches {
    public static void  main(String[] args){


        try{

                String s = null;
                System.out.println(1 / 0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
