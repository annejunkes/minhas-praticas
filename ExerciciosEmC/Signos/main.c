#include <stdio.h>
#include <stdlib.h>

int main()
{
    int dia,mes;
    printf("Digite seu dia e mes de nascimento(ex:25 12)");
    scanf("%d%d",&dia,&mes);
    if((mes==3 && dia>=21) || (mes==4 && dia<=20))
    {
    printf("Seu signo eh aries.\n");
    }
    if((mes==4 && dia>=21) || (mes==5 && dia<=20)){
    printf("Seu signo eh touro.\n");
    }
    if((mes==5 && dia>=21) || (mes==6 && dia<=21)){
    printf("Seu signo eh gemeos.\n");
    }
    if((mes==6 && dia>=22) || (mes==7 && dia<=21)){
    printf("Seu signo eh cancer.\n");
    }
    if((mes==7 && dia>=22) || (mes==8 && dia<=21)){
    printf("Seu signo eh leao.\n");
    }
    if((mes==8 && dia>=22) || (mes==9 && dia<=21)){
    printf("Seu signo eh virgem.\n");
    }
    if((mes==9 && dia>=22) || (mes==10 && dia<=22)){
    printf("Seu signo eh libra.\n");
    }
    if((mes==10 && dia>=23) || (mes==10 && dia<=21)){
    printf("Seu signo eh escorpiao.\n");
    }
    if((mes==11 && dia>=22) || (mes==12 && dia<=21)){
    printf("Seu signo eh sagitario.\n");
    }
    if((mes==12 && dia>=22) || (mes==1 && dia<=21)){
    printf("Seu signo eh capricornio.\n");
    }
    if((mes==1 && dia>=22) || (mes==2 && dia<=21)){
    printf("Seu signo eh aquario.\n");
    }
    if((mes==2 && dia>=22) || (mes==3 && dia<=20)){
    printf("Seu signo eh peixes.\n");
    }
     return 0;
    }
