#include <stdio.h>
#include <stdlib.h>

int main(){
  float x,r,s;
  scanf("%f",&x);
  if(x>=0 && x<=400.00){
    r=x*0.15;
    s=x+r;
    printf("Novo salario: %.2f\n",s);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: 15 %%\n");
  }
  if(x>=400.01 && x<=800.00){
    r=x*0.12;
    s=x+r;
    printf("Novo salario: %.2f\n",s);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: 12 %%\n");
  }
    if(x>=800.01 && x<=1200.00){
    r=x*0.10;
    s=x+r;
    printf("Novo salario: %.2f\n",s);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: 10 %%\n");
  }
    if(x>=1200.01 && x<=2000.00){
    r=x*0.07;
    s=x+r;
    printf("Novo salario: %.2f\n",s);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: 7 %%\n");
  }
    if(x>2000.00){
    r=x*0.04;
    s=x+r;
    printf("Novo salario: %.2f\n",s);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: 4 %%\n");
    }
    return 0;
}
