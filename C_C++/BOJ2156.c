/*
https://www.acmicpc.net/problem/2156
포도주 시식

연속 3잔 못마심 ㅅㄱ
최대 구해라
*/

#include <stdio.h>

#define max(a,b) ((a) > (b) ? (a) : (b))

int main(){
    int num;
    scanf("%d", &num);

    int arr[num];
    for(int i = 1; i <= num; i++){
        scanf("%d", &arr[i]);
    }

    int dp[10000];
    dp[0] = 0;
    dp[1] = arr[1];
    dp[2] = arr[1] + arr[2];

    for(int i = 3; i <= num; i++){
        dp[i] = max( max(dp[i-1], dp[i-2] + arr[i]), dp[i-3] + arr[i-1] + arr[i]);
    }

    printf("%d", dp[num]);

}