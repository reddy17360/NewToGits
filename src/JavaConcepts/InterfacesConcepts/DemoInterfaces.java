package JavaConcepts.InterfacesConcepts;

interface  Robot{
   void head();
   void leg();
   void hands();
   void walk();
   void run();
}
//I am trying to explain you intrerface with one example, hope u
//will get it. Think about robot which u have invented and is so nice.
//so now you want many robots which would have same functionality
//as u have made one... so you know every instance must have same things
//        like hand, leg etc... so for this same things which you need in
//all robots and use of all are also same... for that you can make interface in
//        which same things will be save. now when you want robot with that same
//things you can impliment that interface in your new robot class.
  class ChildRobot implements Robot{ //adapter class

    @Override
    public void head() {
        System.out.println();
    }

    @Override
    public void leg() {

    }

    @Override
    public void hands() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }
}
class Arobot extends ChildRobot{
    @Override
    public void head() {

    }
}
public class DemoInterfaces {
    public static void main(String[] snaju){

    }
}


