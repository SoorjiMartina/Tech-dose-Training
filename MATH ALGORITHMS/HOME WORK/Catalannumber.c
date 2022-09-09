#include <stdio.h>

int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n+1];
    if(n == 0)
        return 1;
    if(n == 1 || n == 2)
        return n;
    arr[0]=1;
    arr[1]=1;
    arr[2]=2;
    for(int i=3;i<=n;i++)
    {
        arr[i]=0;
        for(int j=1;j<=i;j++)
        {
            arr[i] = arr[i] + (arr[i-j]* arr[j-1]);
        }
    }
  printf("%d",arr[n]);
  return 0;
}
