import java.util.*;
import java.lang.*;

class Num{

public static void main(String ar[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number:");

int n=sc.nextInt();

if(n<1)
{
  if(n==0)

   {
        System.out.println("n is zero!");

   }
  else
   {
           System.out.println(n+" is a negative number!");
   }
   
}

else
{
System.out.println(n+" is a positive number!");

}


}}