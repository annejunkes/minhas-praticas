#include <stdio.h>
#include <stdlib.h>

int main(){

    int i,n,q,s=0,r=0,c=0,total;
    double ps,pr,pc;
    char x;
    scanf("%d",&q);
    for(i=0;i<q;i++){

        scanf("%d %c",&n,&x);
        if(x=='S'){
        s = s+n;
        }
        if(x=='R'){
        r = r+n;
        }
        if(x=='C'){
        c = c+n;
        }
        }
        total = s+r+c;
        pc = (c/(total*1.0))*100.00;
        pr = (r/(total*1.0))*100.00;
        ps = (s/(total*1.0))*100.00;

        printf("Total: %d cobaias\n",total);
        printf("Total de coelhos: %d\n",c);
        printf("Total de ratos: %d\n",r);
        printf("Total de sapos: %d\n",s);
        printf("Percentual de coelhos: %.2lf %%\n",pc);
        printf("Percentual de ratos: %.2lf %%\n",pr);
        printf("Percentual de sapos: %.2lf %%\n",ps);
    return 0;
}
