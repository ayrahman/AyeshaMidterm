package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    private static boolean anag;

    public static void main(String[] args) {
        String s1 = "quate";
        String s2 = "hearing";
        int sizes1[] = new int[Character.MAX_VALUE];
        int sizes2[] = new int[Character.MAX_VALUE];
        if (s1.length()!= s2.length())
            System.out.println("NO");
        else{
            for (int i = 0; i< sizes1.length && anag; i++){
             if (sizes1[i]!= sizes2[i]){
                 anag = false;
                 
                }
            }
            if (anag) {
                System.out.println("Anagram");
            }else{
                System.out.println("NO Anagram");
            }
        }
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }
}
