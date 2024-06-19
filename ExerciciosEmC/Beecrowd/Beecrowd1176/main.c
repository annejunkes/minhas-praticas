#include <stdio.h>
#include <stdlib.h>

int main(){
    //fib 0 1 1 2 3 5 8 13 21

    int i;
    int t;
    scanf("%d",&t);

    int n[t];
    for(i=0;i<t;i++){
        scanf("%d",&n[i]);
    }


    long long int fib[61];

    fib[0]=0LL;
    fib[1]=1LL;
    for(i=2; i<61;i++){
        fib[i]=(fib[i-1])+(fib[i-2]);
    }

    for(i=0; i<t;i++){
    printf("Fib(%d) = %lli\n",n[i],fib[n[i]]);
    }

    return 0;
}
