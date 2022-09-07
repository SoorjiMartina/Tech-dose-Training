#include <stdio.h>
int main(void) {
    int n;
   int arr[1000]={0};
  int k=0;
   scanf("%d",&n);
  for(int i=1;i*i<=n;i++)
    {
      if(n%i==0)
      {
       arr[k]=i;
        k++;
      if(i*i!=n)
      {
       arr[k]=n/i;
        k++;
      }
        }
      }
  for(int i=0;i<k;i++)
    {
      for(int j=0;j<k;j++)
        {
          if(arr[i]<arr[j])
          {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
          }
        }
    }
  for(int i=0;i<k;i++){
      printf("%d ",arr[i]);
    }
  return 0;
}
