package quiz36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FileQuiz05 {
   public static void main(String[] args) {
      FileReader fr = null;
      BufferedReader br = null;
      StringTokenizer token = null;

      String arr1[] = new String[5];
      String arr2[] = new String[5];
      String arr3[] = new String[5];
      String arr4[] = new String[5];

      try {
         br = new BufferedReader(new FileReader("D:\\course\\java\\20200421.txt"));
         String s;
         int i=0;
         while((s = br.readLine())!=null) {
            token = new StringTokenizer(s,", ");
            
            
            while(token.hasMoreTokens()) {
               
               
               arr1[i] = token.nextToken();
               arr2[i] = token.nextToken();
               arr3[i] = token.nextToken();
               arr4[i] = token.nextToken();
               
               
               
               
     
            }
            i++;
         }

         System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.toString(arr3));
         System.out.println(Arrays.toString(arr4));
      }catch(Exception e){
         
         
      }
   }
}