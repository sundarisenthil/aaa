
import java.util.*;
import java.lang.*;


Class RepNum {

public static void main(String ar[]) {

int a[]=new int[]{2,3,4,5,4,6,5};
int count=0;
int d=0;

for(int i=0;i<a.length;i++)
{    count=0;
    for(int j=i;j<a.length;j++)
    {
        if(a[i]==a[j])
        {
           count++;

        }
    }
if(count==2)
{
 d=a[i];
 break;

}

}

System.out.println(d);


}}