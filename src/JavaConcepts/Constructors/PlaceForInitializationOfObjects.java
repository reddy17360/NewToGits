package JavaConcepts.Constructors;

public class PlaceForInitializationOfObjects {
    static int count=0;
    {
        System.out.println("block");
       count++;
    }
    String name ;
    int rollno;
    {
      name= "sanju";
        rollno = 10;
    }
    public static void main(String args[]){

        PlaceForInitializationOfObjects p1 = new PlaceForInitializationOfObjects();
        p1.name="sanju";
        p1.rollno=20;
        System.out.println(p1.name + " " + p1.rollno);
        PlaceForInitializationOfObjects p2 = new PlaceForInitializationOfObjects();
        p2.name="sanjus";
        p2.rollno=201;
        System.out.println(p2.name + " " + p2.rollno);

        System.out.println(p2.count);
    }
}
