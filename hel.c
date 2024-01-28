#include <stdio.h>
#include <stdbool.h>
int main() {
  printf("hi\nhi ");
  printf("I am learning C.\n");
  int x = 37;
  printf("%d\n", x);
  float f = 45.0;
  float f2 = 45.0;
  double d = 923847.6;
  printf("%.2f\n", f);
  printf("%.3lf\n", d);
  const int t = 5;
  printf("%i\n", t);
  d = f+x;
  d++;
  bool is = true;
  printf("%i", (double)d==f2);
  return 0;
}