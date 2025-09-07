package JavaConcepts.JavaLangaPackage.ToStringDemo;

public class HashCode {
    //for evert object JVN will generate the unique number i.e hashcode
    //it will be used by jvm while saving objects into the hashin grelated datastructures like hasmap/set/table
    //it will make searching/storing & retrieving the objects fast
public int hashCode(){
    return 32;
}
public String toString(){
    return "sanju";
}

    public static void main(String[] args){
        HashCode h = new HashCode();
        System.out.println(h);
    }
}
