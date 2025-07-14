#include <stdio.h>

void hanoi(int num, int from, int to, int assist);

int cnt = 0;

int main(){
    int num;
    scanf("%d", &num);

    hanoi(num, 1, 3, 2);

    printf("%d", cnt);
}

void hanoi(int num, int from, int to, int assist){
    if(num == 1){
        cnt++;
        return;
    }

    hanoi(num -1, from, assist, to);
    cnt++;
    hanoi(num-1, assist, to, from);
}

