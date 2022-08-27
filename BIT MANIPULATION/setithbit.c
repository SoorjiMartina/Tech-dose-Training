#include <stdio.h>
int  setithbit(int n,int pos)
{
  return n | (1<<(pos-1));
}

int main(void) {
  int a,pos;
  scanf("%d%d",&a,&pos);
  printf("%d",setithbit(a,pos));
  return 0;
}
