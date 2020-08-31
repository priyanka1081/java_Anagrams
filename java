import java.util.Scanner;

public class Solution {

       static boolean isAnagram(String a, String b) {
            char[] s1= a.toCharArray();
           char[] s2= b.toCharArray();


        char temp;
        char temp1;

        if(s1.length==s2.length){
            for(int i=0; i<s1.length; i++){
                for(int j=i+1; j<s1.length; j++){
                if(Character.toLowerCase(s1[i])>Character.toLowerCase(s1[j])){
                    temp=Character.toLowerCase(s1[i]);
                    s1[i]=Character.toLowerCase(s1[j]);
                    s1[j]=temp;
                }else {
                    s1[i]=Character.toLowerCase(s1[i]);
                }

                if(Character.toLowerCase(s2[i])>Character.toLowerCase(s2[j])){
                    temp1=Character.toLowerCase(s2[i]);
                    s2[i]=Character.toLowerCase(s2[j]);
                    s2[j]=temp1;
                }else {
                    s2[i]=Character.toLowerCase(s2[i]);
                }
                
                
                }
            }
        int count=0;
        for(int k=0; k<s1.length; k++){
            if(s1[k]==s2[k])
            count++;
        }

        if(count==s1.length)
        return true;
        else
        return false;


        }else
        return false;



       }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
