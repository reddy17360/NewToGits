package JavaConcepts.StringClass;

public class OurOwnImmutabelClass {
    String i;
    OurOwnImmutabelClass(String i){
        this.i=i;
    }
    public OurOwnImmutabelClass modify(String i){
        if((this.i).equals(i)){
            return this;
        }else {
            return  new OurOwnImmutabelClass(i);
        }
    }
    public static void main(String[] args){

        //once we create an object we can't perfrom any changes
        //on the given object if we try to perform then along with
        //changes new object will be created
        OurOwnImmutabelClass ot = new OurOwnImmutabelClass("sanju");
        OurOwnImmutabelClass ot1= ot.modify("sanju");
        System.out.println(ot==ot1);
    }
}
