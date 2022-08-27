#include <stdio.h>
int issetbit(int n, int pos)
{
  return (n &(1<<(pos-1)) )!=0;
}

int main(void) {
  int n,pos;
  scanf("%d%d",&n,&pos);
  printf("%d",issetbit(n,pos));
  return 0;
}
