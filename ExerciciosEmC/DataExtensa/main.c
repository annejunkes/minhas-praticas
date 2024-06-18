#include <stdio.h>
#include <stdlib.h>

int main() {
    int mes, dia, ano;

    printf("\nDigite dia: ");
    scanf("%d", &dia);
    if(dia > 30)
    printf("dia errado\n");

    printf("\nDigite mes: ");
    scanf("%d", &mes);
    if(mes > 12)
    printf("mes errado\n");
     if(mes == 1){
    printf("janeiro\n");
    }
    else
    if(mes == 2){
    printf("fevereiro\n");
    }
    else
    if(mes == 3){
    printf("março\n");
    }
    else
    if(mes == 4){
    printf("abril\n");
    }
    else
    if(mes == 5){
    printf("maio\n");
    }
    else
    if(mes == 6){
    printf("junho\n");
    }
    else
    if(mes == 7){
    printf("julho\n");
    }
    else
    if(mes == 8){
    printf("agosto\n");
    }
    else
    if(mes == 9){
    printf("setembro\n");
    }
    else
    if(mes == 10){
    printf("outubro\n");
    }
    else
    if(mes == 11){
    printf("novembro\n");
    }
    else
    if(mes == 12){
    printf("dezembro\n");
    }


    printf("\nDigite ano: ");
    scanf("%d", &ano);




    if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)) {
         printf("Ano bissexto");
    }
    else
    {
        printf("Ano nao bissexto");
    }
    return 0;
}
