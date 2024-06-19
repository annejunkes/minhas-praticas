#include <stdio.h>
#include <stdlib.h>

int main(){
    int x;

    printf("Digite um numero para saber se ele eh impar/par:");
    scanf("%d",&x);
    if (x%2==0)
    {
        printf("PAR");
    }
    else
    {
        printf("IMPAR");
    }
return 0;
}
