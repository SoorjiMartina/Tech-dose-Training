#include <stdio.h>

int main(void) {
 int a;
  scanf("%d",&a);
  for(int i=0;i<a;i++)
    {
      int num=1;
      for(int j=0;j<=i;j++){
        
      printf("%d",num);
        num++;
        }
      printf("\n");
      }
  return 0;
}
