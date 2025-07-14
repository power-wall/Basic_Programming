#include <stdio.h>

int main(){

    double result = 0;

    for(int i = 0; i < 100; i++){
        result += 0.1;
    }

    printf("%f", result);

    return 0;
}