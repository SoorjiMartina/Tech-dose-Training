#include <stdio.h>
int flipithbit(int n, int pos)
{
  return n ^(1<< (pos-1));
}

int main(void) {
  int n,pos;
  scanf("%d %d",&n,&pos);
  printf("%d",flipithbit(n,pos));
  return 0;
}
