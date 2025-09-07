package JavaConcepts.JavaLangaPackage.ToStringDemo;

public class EqualsStudent {
    String name;
    int rollno;
    EqualsStudent(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public static void main(String[] args){

        EqualsStudent s1 = new EqualsStudent("Sanju" , 101);
        EqualsStudent s2 = new EqualsStudent("Sanju" , 101);
        EqualsStudent s3=s1;

        System.out.println("===" + (s1==s3));

        System.out.println(s1.equals(1));
    }
    public  boolean equals(Object o){
        try {


            EqualsStudent s = (EqualsStudent) o;


            if (name.equals(s.name) && rollno == s.rollno) {
                return true;
            } else {
                return false;
            }
        }catch (NullPointerException e){
            return false;
        }catch (ClassCastException e){
            return false;
        }
    }
}
