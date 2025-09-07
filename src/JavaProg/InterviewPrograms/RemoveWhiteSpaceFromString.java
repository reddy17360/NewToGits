package JavaProg.InterviewPrograms;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args){
        //userDefined();
        inBuilt();
    }
    public static void userDefined(){
        String str= "S A N J    U" ;

        char[] ch = str.toCharArray();
        String ss = " ";
        for(int i=0;i<str.length();i++){
            if((ch[i]!=' ') || (ch[i] != '\t'))
                ss = ss+ch[i];
        }
        System.out.println("Before" + str);
        System.out.println("After" + ss);


    }
    public static void inBuilt(){
        String str= "S A N J    U" ;
        System.out.println(str);
        String ss = "" ;
        ss =  ss + str.replaceAll("\\s+" , "");
        System.out.println(ss);
    }
}
