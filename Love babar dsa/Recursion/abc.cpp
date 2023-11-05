#include<stdio.h>
int main(){
    int x=0,y=2,z=3;
    int a=~(~x & (!y)|(~z));
    printf("%d",a);
    return 0;
}