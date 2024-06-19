#include <stdio.h>
#include <conio.h>

int main (){

  float salmin, salpessoa, qtdsalmin;

       printf ("Informe o valor do salario minimo \n R$");
       scanf("%f",&salmin);

       printf ("Informe o valor do salario recebido pela pessoa \n R$");
       scanf("%f",&salpessoa);

       qtdsalmin=(salpessoa/salmin);
       printf("Uma pessoa que recebe um salario de R$%.2f reais recebe %.1f salarios minimos\n"
       ,salpessoa,qtdsalmin);

return 0;
}

