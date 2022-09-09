#include <stdio.h>
#define ULL unsigned long long int
ULL gcd(ULL a,ULL b)
{
  return b==0 ? a : gcd(b%a,b);
}
int main(void) {
 ULL a,b;
  scanf("%lld%lld",&a,&b);
  printf("%lld",gcd(b,a));
  return 0;
}
