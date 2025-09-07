package JavaConcepts.JavaLangaPackage.ToStringDemo;

public class ToString {
 public String toString(){
     return "sanju";
 }
    public static void main(String[] args){
        ToString t = new ToString();
        String s = new String("sanjureddy");
        System.out.println(s);
        System.out.println(t);
        System.out.println(t.toString());
    }
}
