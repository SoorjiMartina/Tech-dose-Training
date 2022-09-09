#include <stdio.h>
#include <string.h>
int main(void) {
  char str[1001];
  scanf("%[^\n]s",str);
  int n=strlen(str),i,c=0;
  for(i=0;i<n/2;i++)
    {
      if(str[i]==str[n-i-1])
        c++;
    }
  if(c==i)
  {
    printf("%s is a Palindrome",str);
  }
  else
  {
    printf("%s is not a Palindrome",str);
  }
  return 0;
}
