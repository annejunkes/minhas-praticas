#include <stdio.h>
#include <stdlib.h>

int main(){

int i,n[20],x;

for(i=0;i<20;i++){
    scanf("%d",&n[i]);}

    for(i=0;i<10;i++){
        x=n[i];
        n[i]=n[19-i];
        n[19-i]=x;}

        for(i=0;i<20;i++){
            printf("N[%d] = %d\n",i,n[i]);
        }
    }
