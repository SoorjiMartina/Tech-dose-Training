#include <stdio.h>
char toggleCase(char a)
{
        return a^=(1<<5);
}
char lower(char a)
{
  
   return a|(1<<5);
}
char upper(char a)
{
   return a & (~ (1<<5));
}
int main(void) {
  char a;
  scanf("%c",&a);
  printf("%c\n",lower(a));
  printf("%c\n",upper(a));
  printf("%c\n",toggleCase(a));
  
  return 0;
}
