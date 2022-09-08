#include <stdio.h>
int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    {
      scanf("%d",&arr[i]);
    }
  for(int i=0;i<n;i++)
    {
       int midindex=i;
  for(int j=i+1;j<n;j++)
    {
      if(arr[midindex]>arr[j])
      {
        midindex=j;
      }
    }
      int temp = arr[midindex];
      arr[midindex]=arr[i];
      arr[i]=temp;
      }
  for(int i=0;i<n;i++)
    {
      printf("%d ",arr[i]);
    }
  return 0;
}
