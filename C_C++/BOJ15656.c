/*
https://www.acmicpc.net/problem/15656

N과 M(7)

N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
N개의 자연수는 모두 다른 수이다.

N개의 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.

한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며,
각 수열은 공백으로 구분해서 출력해야 한다.
수열은 사전 순으로 증가하는 순서로 출력해야 한다.
*/

#include <stdio.h>
#include <stdlib.h>

int N, M;
int arr[8];
int result[8];

int compare(const void *a, const void *b){
    return (*(int *)a - *(int *)b);
}

void dfs(int depth){
    if(depth == M){
        for(int i = 0; i < M; i++){
            printf("%d ", result[i]);
        }
        printf("\n");
        return;
    }

    for (int i = 0; i < N; i++) {
        result[depth] = arr[i];
        dfs(depth + 1);
    }

}

int main(){

    scanf("%d %d", &N, &M);
    for(int i = 0; i < N; i++){
        scanf("%d", &arr[i]);
    }

    qsort(arr, N, sizeof(int), compare);

    dfs(0);
    





    


}

