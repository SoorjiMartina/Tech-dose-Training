#include <stdio.h>
int unsetithbit(int n, int pos)
{
  return n & (~(1<<(pos-1)));
}

int main(void) {
  int n,pos;
  scanf("%d%d",&n,&pos);
  printf("%d",unsetithbit(n,pos));
  return 0;
}
