class Pri {
public static void main(String arg[]) {

int a[]=new int[]{2,3,4,5};

int i=0;
int j=0;
int cnt=0;
int c=0;

for(i=0;i<a.length;i++)
{
 cnt=0;
 for(j=2;j<=a[i];j++)
 {
  if(a[i]%j==0)
  { cnt++;  }

 }
if(cnt==1)
{
  c++;
}

}