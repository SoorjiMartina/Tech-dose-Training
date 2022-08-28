#include <stdio.h>
int oddeven(int a)
{
  if(a&1)
  {
    printf("odd");
  }
  else
  {
    printf("even");
  }
}

int main(void) {
int n;
  scanf("%d",&n);
  oddeven(n);
  return 0;
}
