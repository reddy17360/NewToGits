package JavaConcepts.StaticMembers;

//public class StaticDemo {
//
//   static String cName = "Gojek";
//   String eName ="Sanju";
//   int salary=32000;
//
//   public  String getEmpDetails(){
//        return cName + " " + eName + " " +  salary;
//    }
//
//    public static String eNames() {
//        return cName ;
//    }
//
//    public static void main(String [] sanju){
//
//
//        System.out.println( StaticDemo.eNames());
//        System.out.println( new StaticDemo().getEmpDetails());
//
//
//    }
//
//}

   // public class Solution {


//        public static class Rabbit {
//            public String toString() {
//                return "Rabbit";
//            }
//        }

public class StaticDemo{

    public static void main(String[] args){

            Rabbit rabbit1 = new Rabbit();
            Rabbit rabbit2 = new Rabbit();
            System.out.println(rabbit1);
            System.out.println(rabbit2);

            //write your code here

            Horse h1 = new Horse();
            Horse h2 = new Horse();

            System.out.println(h1);
            System.out.println(h2);


    }

}
class Rabbit{
    public String toString(){
        return "sanju";
    }
}
class Horse{

}