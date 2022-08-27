#include <stdio.h>
int complement(int n)
{
  return ~ n;
}
int complement2(int n)
{
  return (~ n)+1;
}
int main(void) {
  int n;
  scanf("%d",&n);
  printf("%d",complement(n));
  printf("%d",complement2(n));
  return 0;
}
