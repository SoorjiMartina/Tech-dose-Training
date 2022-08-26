#include <stdio.h>
int checkpowerof2(int x)
{
  if((x!=0) && ((x&(x-1))==0))
    return 1;
  return 0;
}
int main(void) {
  int n;
  scanf("%d",&n);
  printf("%d",checkpowerof2(n));
  return 0;
}
