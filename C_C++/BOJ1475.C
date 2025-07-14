#include <stdio.h>

int main(){
    char str[1000001];
    int num[10] = {0,};

    scanf("%s", str);

    for(int i = 0; str[i] != '\0'; i++){
        int digit = str[i] - '0';
        num[digit]++; 
    }

    int sixnine = num[6] + num[9];
    int max = (sixnine+1)/2;

    for(int i = 0; i < 10; i++){
        if(i == 6 || i == 9) continue;
        if(max < num[i]){
            max = num[i];
        }
    }

    printf("%d", max);

    return 0;
}