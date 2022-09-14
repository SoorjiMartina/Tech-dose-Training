#include <stdio.h>

int main(){
  int n;
  scanf("%d",&n);
  int r;
  int arr[100];
int i=0;
   while(n!=0){
     r=n%10;
     arr[i]=r;
     i++;
     n=n/=10;
     }
  for(int j=i-1;j>=0;j--){
    printf("%d\n",arr[j]);
  }
  return 0;
}
