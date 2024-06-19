#include <stdio.h>
#include <stdlib.h>

int main(){
    float t=0;
    int i,qi;

    scanf("%d %d",&i,&qi);
    if(i==1){
        t=4.00*qi;
        }
    if(i==2){
        t=4.50*qi;
        }
    if(i==3){
        t=5.00*qi;
        }
    if(i==4){
        t=2.00*qi;
    }
    if(i==5){
        t=1.50*qi;
    }

printf("Total: R$ %.2f\n",t);

return 0;
}

