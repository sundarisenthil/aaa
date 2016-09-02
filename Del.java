class Del {
public static void main(String arg[]) {

String s="ReverseMe";
s.reverse();
StringBuffer s1=new StringBuffer(s);
for(int i=0;i<s1.length();i++)
 {
   if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
   {

      s1.deleteCharAt(i);
   }
 
 }
System.out.print(s1);

}
}