#include <stdio.h>
#define ULL unsigned long long int
ULL gcd(ULL a,ULL b)
{
  return (a==0) ? b : gcd(b%a,a);
}
int main(void) {
 ULL a,b;
  scanf("%lld%lld",&a,&b);
  printf("%lld",gcd(b,a));
  return 0;
}
