#include<stdbool.h>
int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    {
      scanf("%d",arr+i);
    }
  for(int i=n-1;i>=0;i--)
    {
      bool issawpped= false;
      for(int j=0;j<n;j++)
        {
          if(arr[j]>arr[j+1])
          {
            int temp =arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            issawpped = true;
          }
        }
      if(issawpped==false)
      {
        break;
      }
    }
  for(int i=0;i<n;i++)
    {
      printf("%d ",arr[i]);
    }
  return 0;
}
