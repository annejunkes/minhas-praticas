#include <stdio.h>
#include <stdlib.h>

int main(){
    int x,i,maior,posicao;
    maior=0;
    posicao=0;

    for(i=0;i<100;i++){
    scanf("%d",&x);
    if(x > maior){

    maior = x;
    posicao = i+1;

    }
    }
    printf("%d\n%d\n",maior,posicao);
    return 0;
}
