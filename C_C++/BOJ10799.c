/*
https://www.acmicpc.net/problem/10799
쇠막대기
 
가서 읽어라
*/

#include <stdio.h>

int main(){
    char arr[100001];
    scanf("%s", arr);

    int cnt = 0;
    int stick = 0;
    char recent = 0;

    for(int i = 0; arr[i] != '\0'; i++){
        if(arr[i] == '('){
            cnt++;
        }
        else{ // ) 인 경우
            cnt--;
            if(recent == '('){
                stick += cnt;
            }
            else{
                stick++;
            }
        }
        recent = arr[i];
    }

    printf("%d", stick);
}