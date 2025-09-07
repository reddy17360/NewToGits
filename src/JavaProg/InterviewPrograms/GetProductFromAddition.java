package JavaProg.InterviewPrograms;
//want a product of given numbers by performing addition
public class GetProductFromAddition {
    public static void main(String[] args){
        add(3,4);
    }
    //3 , 4
    public static void add(int a , int b){
        int c=0;
        for(int i=1;i<=b ; i++) {
          c = c + a;
        }
        System.out.println(c);

    }
}
