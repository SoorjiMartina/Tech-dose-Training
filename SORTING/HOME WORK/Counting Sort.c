#include <stdio.h>
void countingsort(int arr[],int n)
{
  int arr1[10];
  int x = arr[0];
  for(int i=0;i<n;i++){
  if(arr[i]>x)
  {
    x=arr[i];
  }
    }
  int countarr[10];
  for (int i = 0; i <= x; ++i) {
    countarr[i] = 0;
  }
     for (int i = 0; i < n; i++) {
    countarr[arr[i]]++;
  }
for (int i = 1; i <= x; i++) {
    countarr[i] += countarr[i - 1];
  }

 
  for (int i = n - 1; i >= 0; i--) {
    arr1[countarr[arr[i]] - 1] = arr[i];
    countarr[arr[i]]--;
  }

  for (int i = 0; i < n; i++) {
    arr[i] = arr1[i];
  }
}

int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    {
      scanf("%d",&arr[i]);
    }
  countingsort(arr, n);
  for(int i=0;i<n;i++)
    {
      printf("%d ",arr[i]);
    }
  return 0;
}
