#include <stdio.h>

int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    {
      scanf("%d",arr+i);
    }
  //mean
  int mean=0;
  for(int i=0;i<n;i++)
    {
      mean+=arr[i];
    }
  printf("%d\n",mean/n);
  //median
  if(n%2!=0)
  {
      printf("%d\n",(n+1)/2);
  }
  else
  {
    printf("%.2f\n",((n)/2+((n/2)+1))/2.0);
  }
  //mode
  int maxcount=0,count=0,maxval=0;
  for(int i=0;i<n;i++){
    count=0;
    for(int j=0;j<n;j++)
      {
         if(arr[i]==arr[j])
         {
           count++;
         }
      }
  if(count>maxcount)
  {
    maxcount=count;
    maxval=arr[i];
  }
  }
  printf("Mode is :%d and count is:%d\n",maxval,maxcount);
  return 0;
}
