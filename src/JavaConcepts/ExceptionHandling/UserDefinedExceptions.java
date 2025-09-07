package JavaConcepts.ExceptionHandling;
//based on our requirements user can define their own exceptions

class TooYoungExcepiton extends RuntimeException{
    TooYoungExcepiton(String s){
        super(s);
    }
}
class TooOldExcepiton extends RuntimeException{
    TooOldExcepiton(String s){
        super(s);
    }
}
public class UserDefinedExceptions {

    // created the matromony website , so only age b/w 18 to 50 can create their profile , other
    //than this age is not allowed
    public static void main(String[] args){





        String name= "sanju";
        int nn = Integer.parseInt(name);
        System.out.println(nn);
        System.out.println(nn);

        int age = Integer.parseInt("200");
        if (age < 18) {
            throw new TooYoungExcepiton("Time ede maccha tadko");
        } else if (age >= 60) {
            throw new TooOldExcepiton("Time bala agide maccha");
        } else {
            System.out.println("We will email you the match details soon...!");
        }
    }
}
