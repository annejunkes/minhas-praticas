#include <stdio.h>
#include <stdlib.h>

int main()
{
    int diainicial,horainicial,minutoinicial,segundoinicial;
    int diafinal,horafinal,minutofinal,segundofinal;
    int duracaodias,duracaohoras,duracaominutos,duracaosegundos;


    printf("Dia ");
    scanf("%d",&diainicial);
    while(diainicial<1 || diainicial>30){
        printf("Dia invalido. Digite novamente:\n");
        scanf("%d",&diainicial);
    }
    scanf("%d",&horainicial);
    while(horainicial<0 || horainicial>23){
        printf("Hora invalida. Digite novamente:\n");
        scanf("%d",&horainicial);
    }
    scanf("%d",&minutoinicial);
    while(minutoinicial<0 || minutoinicial>60){
        printf("Minuto invalido. Digite novamente:\n");
        scanf("%d",&horainicial);
    }
    scanf("%d",&segundoinicial);
    while(segundoinicial<0 || segundoinicial>60){
        printf("Segundo invalido. Digite novamente:\n");
        scanf("%d",&segundoinicial);
    }

    printf("Dia ");
    scanf("%d",&diafinal);
        while(diafinal<diainicial || diafinal>30){
        printf("Dia invalido. Digite novamente:\n");
        scanf("%d",&diafinal);
        }
    scanf("%d",&horafinal);
    while(horafinal<0 || horafinal>23){
        printf("Hora invalida. Digite novamente:\n");
        scanf("%d",&horafinal);
    }
    scanf("%d",&minutofinal);
    while(minutofinal<0 || minutofinal>60){
        printf("Minuto invalido. Digite novamente:\n");
        scanf("%d",&minutofinal);
    }
    scanf("%d",&segundofinal);
        while(segundofinal<0 || segundofinal>60){
        printf("Segundo invalido. Digite novamente:\n");
        scanf("%d",&segundofinal);
    }

    if(segundoinicial>segundofinal){
        duracaosegundos= 60-(segundoinicial-segundofinal);
    }
    else if(segundoinicial<=segundofinal){
            duracaosegundos = segundofinal-segundoinicial;
    }
    if(minutoinicial>minutofinal){
            duracaominutos = 60-(minutoinicial-minutofinal);
    }
    else if(minutoinicial<minutofinal){
    duracaominutos = minutofinal-minutoinicial;
    }

    if(horainicial>horafinal){
            duracaohoras=24-(horainicial-horafinal);
            duracaodias= (diafinal-diainicial)-1;
    }
    else if(horainicial<=horafinal){
            duracaohoras = horafinal-horainicial;
            duracaodias = diafinal-diainicial;
    }

    printf("%d dia(s)\n",duracaodias);
    printf("%d hora(s)\n",duracaohoras);
    printf("%d minuto(s)\n",duracaominutos);
    printf("%d segundo(s)\n",duracaosegundos);

    return 0;
}
