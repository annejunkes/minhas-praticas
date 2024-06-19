#include <stdio.h>
#include <stdlib.h>

int main(){
int i;
double x,v[100];

scanf("%lf",&x);
v[0]=x;
for(i=1;i<100;i++){
    v[i]=v[i-1]/2.0;}
for(i=0;i<100;i++){
    printf("N[%d] = %.4lf\n",i,v[i]);}
}
