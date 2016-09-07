
import java.util.*;
import java.lang.*;


Class Str {

public static void main(String ar[]) {

StringBuffer s=new StringBuffer("hello");

for(int i=0;i<=(int)Math.ceil(s.length()/2);i++)
{

char a=s.charAt(i);
char b=s.charAt(i+2);
s.deleteCharAt(i);
s.insert(i,b);
s.deleteCharAt(i+2);
s.insert(i+2,a);

}
System.out.print(s);

}}