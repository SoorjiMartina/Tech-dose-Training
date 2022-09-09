#include <stdio.h>

int main(void) {
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
    {
      if(n==i*i)
      {
        printf("%d is a Perfect Square",n);
        return 0;
      }
      }
        printf("%d is not a Perfect Square",n);
        return 0;
}
