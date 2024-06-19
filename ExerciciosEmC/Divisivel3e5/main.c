#include <stdio.h>
#include <math.h>

int main (){

  int numero;

    printf("Digite um numero para descobrir se ele eh divisivel por 3 e 5:\n");
    scanf("%d",&numero);

    if(numero%3==0 && numero%5==0){
       printf ("O numero eh divisivel por 3 e 5\n");
    }
    if(numero%3==0 && numero%5!=0){
       printf("O numero eh divisivel por 3\n");
    }
    if(numero %3!=0 && numero%5==0){
       printf("O numero eh divisivel por 5\n");
    }
    if(numero %3!=0 && numero%5!=0){
        printf("O numero nao eh divisivel\n");
    }
    return 0;
    }
