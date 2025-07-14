/*
https://www.acmicpc.net/problem/3273
두 수의 합

n개의 서로 다른 양의 정수 수열, a(i)의 값은 1보다 크거나 같고
1000000보다 작거나 같은 자연수
자연수 x가 주어졌을때 a(i) + a(j) = x(1<= i < j <= n)을 만족하는
(a(i), a(j))쌍의 수를 구해라

input : 첫줄 수열의 크기 n, 다음 줄 수열, 셋째 줄 x
*/

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int num, x;
    cin >> num;

    vector<int> arr(num);
    for(int i = 0; i < num; i++){
        cin >> arr[i];
    }
    cin >> x;

    sort(arr.begin(), arr.end());

    int left = 0;
    int right = num - 1;
    int pair = 0;

    while (left < right)
    {
        int sum = arr[left] + arr[right];

        if(sum == x){
            left++;
            right--;
            pair++;
        }
        else if(sum > x){
            right--;
        }
        else if(sum < x){
            left++;
        }
    }

    cout << pair << endl;
    return 0;

}