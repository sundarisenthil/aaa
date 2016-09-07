
import java.util.*;
import java.lang.*;


Class Camel {

public static void main(String ar[]) {

StringBuffer s=new StringBuffer("hello hai");

for(int i=0;i<s.length();i++)
{
 if(s.charAt(i)==' ')
   {
     String s1=(String.valueOf(s.charAt(i+1))).toUpperCase();
     s.delete(i,i+2);
     s.insert(i,s1);
   }


}
System.out.println(s);



}}