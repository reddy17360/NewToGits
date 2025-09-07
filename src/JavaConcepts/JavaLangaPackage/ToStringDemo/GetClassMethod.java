package JavaConcepts.JavaLangaPackage.ToStringDemo;

import JavaConcepts.InnerClass.RegularClassDemos.AnanymousClassesDemo.AnaDemo;
import JavaConcepts.Threads.CaseFive;
import JavaConcepts.Threads.ThreadClassMimic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) throws NoSuchMethodException {
//to get a runtime class definition of an object
        //to get a any information of an current object like which type what are the methods it has
     //   getClass() is used to get information about the current object at runtime
        //   — like its actual type, available methods, fields, constructors, etc. — using reflection.
        int count=0;
        Object o = new ThreadClassMimic();
        System.out.println(o.getClass().getName());

        Class c = o.getClass();
        System.out.println(c.getName());

    }
}
