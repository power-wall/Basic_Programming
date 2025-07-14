/*
https://www.acmicpc.net/problem/9020
골드바흐의 추측

2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다. 구해라

입력 : 첫줄에 testcase 개수, 한 줄씩 짝수 n
출력 : 각 테스트케이스에 대해 주어진 n의 골드바흐 파티션, 작은 것부터 출력, 공백 구분
*/

#include <iostream>
#include <cmath>

using namespace std;

void goldBach(int num);
bool isPrime(int num);

int main(){
    int testcase;
    cin >> testcase;

    while (testcase-- > 0)
    {
        int num;
        cin >> num;

        goldBach(num);
    }

    return 0;
    
}

void goldBach(int num){
    int left = num/2;
    int right = num/2;

    while (left > 0)
    {
        bool leftPrime = isPrime(left);
        bool rightPrime = isPrime(right);

        if(leftPrime && rightPrime){
            cout << left << " " << right << endl;
            break;
        }

        left--;
        right++;
    }
    
}

bool isPrime(int num){
    if (num < 2) return false;

    int end = sqrt(num);
    for (int i = 2; i <= end; i++) {
        if (num % i == 0) return false;
    }
    return true;
}