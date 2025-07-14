#include <stdio.h>
#include <ctype.h>

int main(){
    char str[1000001];
    int alpha[26] = {0,};

    scanf("%s", str);

    for(int i = 0; str[i] != '\0'; i++){
        char bigChar = toupper(str[i]);
        alpha[bigChar - 'A']++;
    }

    int max = 0;
    char result = '?';
    for(int i = 0; i < 26; i++){
        if(alpha[i] > max){
            max = alpha[i];
            result = 'A' + i;
        }
        else if(alpha[i] == max){
            result = '?';
        }
    }

    printf("%c\n", result);

    

}