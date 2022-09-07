#include <stdio.h>
#define ULL unsigned long long int
ULL getPower(ULL base,ULL power)
{
  int res=1;
  while(power>0)
    {
      if(power%2==1)
      {
        res *= base;
      }
      base = base*base;
      power /= 2;
    }
  return res;
}
int main(void) {
  ULL base,power;
  scanf("%lld %lld",&base,&power);
  printf("%lld",getPower(base,power));
  return 0;
}
