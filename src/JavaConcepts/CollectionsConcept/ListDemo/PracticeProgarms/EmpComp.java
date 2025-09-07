package JavaConcepts.CollectionsConcept.ListDemo.PracticeProgarms;

import JavaConcepts.CollectionsConcept.ListDemo.SetDemo.Employee;

import java.util.Comparator;
import java.util.TreeSet;

class Employees
{
    String name;
    int eid;
    Employees(String name , int eid){
        this.name=name;
        this.eid=eid;
    }
    public int empIDs(){
        return eid;
    }
    public String eName(){
        return name;
    }
//    public int compareTo(Object o) {
//            int e1= this.eid;
//          Employees e=(Employees) o;
//            int e2 =e.empIDs();
//            if(e1 < e2)
//                return -1;
//            else if (e1 > e2)
//                return +1;
//            else
//                return 0;
//        }

        public String toString(){
        return eid + " --------" + name;
        }
}
public class EmpComp {

    public static void main(String args[]){
        Employees e1 = new Employees("Reddy" , 101);
        Employees e2 = new Employees("ReddySanju" ,102);
        Employees e3= new Employees("Manju" , 103);
        Employees e4 = new Employees("Maruti" , 121);
        Employees e5 = new Employees("Venku" , 10);
        Employees e6 = new Employees("Reddy" , 80);
        System.out.println("sorted based on empid");
        TreeSet ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        System.out.println(ts);

//        System.out.println("sorted based on names");
    TreeSet ts1 = new TreeSet( Comparator.comparing(Employees::eName).thenComparing(Employees::empIDs).reversed());
        ts1.addAll(ts);
//        ts1.add(e1);
//        ts1.add(e2);
//        ts1.add(e3);
//        ts1.add(e4);
//        ts1.add(e5);
//        ts1.add(e6);
//        System.out.println(ts1);
//    }
//}
//class MyCom implements Comparator<Employees>
//{
//    public int compare(Employees e1 , Employees e2){
//        String en1 = e1.eName();
//        String en2 = e2.eName();
//     return   en1.compareTo(en2);
}
}