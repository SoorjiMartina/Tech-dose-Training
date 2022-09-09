#include <stdio.h>
int main(void) {
  int a,b;
  scanf("%d%d",&a,&b);
  int max =(a>b)? a:b;
  while(1)
    {
      if(max%a==0 && max%b==0)
      {
        printf("%d",max);
        break;
      }
      ++max;
    }
  return 0;
}
Method:2
#include <stdio.h>
#define ULL unsigned long long int
ULL gcd(ULL a,ULL b)
{
  return (a==0) ? b : gcd(b%a,a);
}
int main(void) {
 ULL a,b;
  scanf("%lld%lld",&a,&b);
  printf("%lld",(a*b)/gcd(b,a));
  return 0;
}
