package JavaProg.InterviewPrograms;

public class Anagram {
    public static void main(String[] args){
  findAnagram("eat" , "tea");
}
  static void findAnagram(String ana , String gram) {
      if (ana.length() == gram.length()) {
          char[] a=ana.toCharArray();
          char[] b=gram.toCharArray();

          if(a.equals(b))
              System.out.println("given string is anagram");
      }
  }
}
