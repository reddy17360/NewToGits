package JavaConcepts.CollectionsConcept.ListDemo.SetDemo;

import javax.management.ObjectName;
import java.util.Comparator;
import java.util.TreeSet;
  public class Employee implements Comparable {
    String eName;
    int eid;
    Employee(String eName , int eid){
        this.eName = eName;
        this.eid = eid;
    }
    public int empID(){
        return eid;
    }
    public String empName(){
          return eName;
      }

    public int compareTo(Object ob1){
        Employee e = (Employee) ob1;
         int i2= e.empID();
         int i1= this.eid;
         if(i1 > i2)
             return 1;
         else if(i1 < i2)
             return -1;
         else return 0;
    }
    public String toString(){
        return eName + " ....."+ eid;
    }
  }
 class UserDefined {
    public static void main(String[] args) {
        Comparator  ss = new Comparator(){
            public int compare(Object o1, Object o2) {
              Employee   s1 = (Employee)o1;
              String sname1= s1.eName;
                Employee   s2 = (Employee)o2;
                String sname2=s2.eName;

                if(sname1.length() == sname2.length()) {
                    return s1.compareTo(s2);
                }
                return Integer.compare(sname1.length(), sname2.length());
            }
        };


        Employee e1 = new Employee("AA", 100);
        Employee e2 = new Employee("B", 2);
        Employee e3 = new Employee("AAA", 3);
        Employee e4 = new Employee("A", 19);
        Employee e5 = new Employee("M", 250);
        Employee e6 = new Employee("BB", 23);
        TreeSet t = new TreeSet(ss);

      //  TreeSet t = new TreeSet(Comparator.comparing(Employee::empName));
        //to sort by specified property
        // TreeSet t = new TreeSet(Comparator.comparingInt(Employee::empID));
        //sort by specified propery specifically for integers
       // TreeSet t = new TreeSet(Comparator.comparing(Employee::empName));
      //if first comparison is equal then try the next one
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);
        System.out.println(t);
    }
}

