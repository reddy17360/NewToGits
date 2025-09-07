package JavaProg.NumberBased;

public class Savings {
    public static void main(String[] args){
        int n=30 ;
        int savings =0;
        for(int i=1;i<=n;i++){
            savings = savings + i+i;
        }
        System.out.println("Savings at the end of every month" + savings);
    }
}
