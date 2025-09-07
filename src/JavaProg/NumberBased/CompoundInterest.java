package JavaProg.NumberBased;

public class CompoundInterest {
    public static void main(String args[]){
      CompoundInterest compoundInterest = new CompoundInterest();
      compoundInterest.Ci(1000,2,1);
    }
    public void Ci(double principle , double rate , int time){

       // ci = p(1 + rate/100) power of time

        double compoundInterest = principle * Math.pow(1 + rate/100 ,  time) ;

        System.out.println(compoundInterest);
    }
}
