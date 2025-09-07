package JavaConcepts.StringClass;
class Cat{
    int i;
    Cat(int i){
        this.i=i;
    }

}
class Dog implements Cloneable{
    Cat c;
    int j;
    Dog(Cat c , int j){
        this.c=c;
        this.j=j;
    }

}
public class DeepCloning implements  Cloneable{
    //cloning is process of creating exactly same duplicate copy of object
    //main purpose is to maintain state of object & backup copy
    //this is example for deep cloning

    public static void  main(String[] args) throws CloneNotSupportedException{


        Cat c = new Cat(10);
        Dog d1 = new Dog(c, 20);
         System.out.println(d1.j + "..." +  d1.c.i);

       // Dog d2 = (Dog) d1.clone();

    }

}
