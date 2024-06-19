#include <stdio.h>
#include <stdlib.h>

int main(){
    double s,i;

    scanf("%lf", &s);
    if(s<=2000.00){
        printf("Isento\n");
    }else
    if(s>=2000.01 && s<=3000.00){
        i=(s-2000.00)*0.08;
        printf("R$ %.2f\n",i);
    }else
    if(s>=3000.01 && s<= 4500.00){
        i=(s-3000.00)*0.18 + 1000.00*0.08;
        printf("R$ %.2f\n",i);
    }else
    if(s>= 4500.01){
        i=(s-4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08;
        printf("R$ %.2f\n",i);
    }
    return 0;
}
