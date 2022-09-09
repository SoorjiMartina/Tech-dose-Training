#include <stdio.h>

int main(void) {
  int n,r;
  scanf("%d%d",&n,&r);
  int arr[n+1][n+1];
  for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
        {
          if(j==0 ||i==j)
          {
            arr[i][j]=1;
          }
          else{
            arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
          }
      }
      printf("%d ",arr[n][r]);
  return 0;
}
