#include <stdio.h>
#include <stdlib.h>

int main() {
    int x, ano;
    printf("\nDigite o ano: ");
    scanf("%d",&ano);
    x = ano % 1000;
    if((ano >= 1000) && (ano < 10000)) {
      if (x > 0) {
         printf("OK! Ano inteiro com 4 digitos");
       }
    }
    else
    {
        printf("O ano digitado nao tem 4 digitos");
    }
    return 0;
}
