package JavaProg.NumberBased;

import JavaConcepts.Modifiers.*;




import java.util.Arrays;

public class Anagram extends AbstractAct{
    int a=10;
    static int b=20;
    public void s(){
        System.out.println(b);
    }



    public static void main(String args[]) {
        //let's say a & b are two strings, if they contain all the same characters with the same frequ
        //encies
        System.out.println(b);

        AbstractAct abstractAct= new AbstractAct();
        Anagram anagram = new Anagram();
        anagram.m2();

        String a = "sreddysanjuo";
        String b = "sanjureddyss" ;

        if(a.length()== b.length()){
          char[] ch1 = a.toCharArray();
          char[] ch2 = b.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
          if(Arrays.equals(ch1,ch2)){
              System.out.println("Anagrams string");
          }else
              System.out.println("no no");


            }


            }


        }



