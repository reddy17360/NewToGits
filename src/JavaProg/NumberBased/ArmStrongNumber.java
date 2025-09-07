package JavaProg.NumberBased;

public class ArmStrongNumber {
    //n digits number is equal to sum of power of it's nth digits

    public static  void main(String args[]){
        ArmStrongNumber armStrongNumber = new ArmStrongNumber();
        armStrongNumber.number(153);
    }
    public void number(int n){
        int copy = n;
        int count = 0;
        while(n != 0){
            n = n / 10;
            count++;
        }
        double  power  = 0 ;
        while(copy!=0){
           power = power + Math.pow( copy % 10 , count);
           copy = copy  / 10;
        }
        System.out.println(power);
    }
}
