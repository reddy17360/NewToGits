package JavaConcepts;

public class MethodChaining {
    //it works when a method returns an object , that allow you to call another method on it
    //we can call xle methods as long as each method return an object that supports another call
    private String name ;
    private int age;

    public MethodChaining setName(String name){
        this.name = name;
        System.out.println(name);
        System.out.println(this);
        return this;

    }
    public MethodChaining setAge(int age){
        this.age = age;
        System.out.println(name  + " :  " + age  );
        return this;
    }
    public String add(){
        System.out.println(age+name);
        return   age+name;

    }


}
class Demo{
    public static void main(String[] args){
       MethodChaining mt= new MethodChaining();
        System.out.println(mt);
        mt.setName("sanju");
       mt.setAge(27).add();
    }
}
