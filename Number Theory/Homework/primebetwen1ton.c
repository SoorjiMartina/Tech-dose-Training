#include <stdio.h>
#include<stdlib.h>
#include<stdbool.h>

int main(void) {
  int n;
  scanf("%d",&n);
  bool prime[1000];
  for(int i=2;i*i<=n;i++)
    {
      prime[i]=true;
    }
  for(int i=2;i*i<=n;i++)
    {
      if(prime[i])
      {
        for(int j=2;j*j<=n;j++)
          {
            prime[i*j]=false;
          }
      }
    }
  for(int i=1;i<=n;i++)
    {
      if(prime[i])
      {
        printf("%d ",i);
      }
    }
  
  return 0;
}
