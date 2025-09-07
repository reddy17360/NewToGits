package JavaConcepts.FlowControl.TransferStatements;

public class Breaks {
    public static void main(String[] sanju){
        int i=0;

        for( i = 2; i<=10 ; i++) {
            System.out.println(i);
            if(i%2==0)
            break;

        }
        int ii=1;
         switch (ii){
             case 1:
                 System.out.println("one");
                 break;
             case 2 :
                 System.out.println("two");
                 break;
             default:
                 System.out.println("default");
         }

    }
}
