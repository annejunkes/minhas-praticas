#include <stdio.h>
#include <locale.h>

int main (){

  int horas, minutos;

  setlocale(LC_ALL,"portuguese");

       printf ("Informe a hora atual (formato 24h)\n");
       scanf("%d",&horas);
       minutos=(horas*60);
       printf ("Desde o in�cio do dia at� a o momento atual, passaram-se %d minutos\n",minutos);
    return 0;
    }
