#include <stdio.h>
int countsetBits(int a)
{
  int count=0;
  for(int i=1;i<a;i<<=1)
    {
      if(a&i)
      {
        count++;
      }
    }
  return count;
}
int countsetbits(int n)
{
  int count =0;
  while(n)
    {
      n=n&(n-1);
      count++;
    }
  return count;
}
int countsetbit(int n)
{
  int count=0;
  while(n)
    {
      count+=n&1;
        n>>=1;
    }
  return count;
}
int main(void) {
  int a;
  scanf("%d",&a);
  printf("%d\n",countsetBits(a));
  printf("%d\n",countsetbits(a));
  printf("%d\n",countsetbit(a));
  return 0;
}
