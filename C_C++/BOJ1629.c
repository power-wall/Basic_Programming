/*
https://www.acmicpc.net/problem/1629
곱셈

이게 왜 실1? 다 이유가 있다

A를 B번 곱한 수를 C로 나눈 나머지 출력
*/
#include <stdio.h>

long long power(long long A, long long B, long long C){
    if(B == 0){
        return 1;
    }
    if(B == 1){
        return A % C;
    }

    long long half = power(A, B/2, C);
    long long result = (half * half) % C;

    if(B % 2 == 1){
        result = (result * A) % C;
    }

    return result;
}


int main(){
    long long A, B, C;
    scanf("%lld %lld %lld", &A, &B, &C);

    long long result = power(A, B, C);
    printf("%lld", result);

}