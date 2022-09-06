#include <stdio.h>
int isprime(int val)
{
  for(int i=2;i<val;i++)
    {
      if(val%i==0)
      {
        return 0;
      }
    }
  return 1;
}
int isprime1(int val)
{
  for(int i=2;i*i<=val;i++)
    {
      if(val%i==0)
      {
        return 0;
      }
    }
  return 1;
}
int main(void) {
  int n;
  scanf("%d",&n);
  printf(isprime(n)?"Prime\n":"NotPrime\n");
  printf(isprime1(n)?"Prime":"NotPrime");
  return 0;
}
