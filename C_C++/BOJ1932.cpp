/*
https://www.acmicpc.net/problem/1932
정수 삼각형

최대가 되는 경로 선택

첫째 줄 삼각형 크기
둘째 줄 부터 삼각형
*/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    int num;
    cin >> num;

    vector<vector<int>> triangle(num);
    for(int i = 0; i < num; i++){
        triangle[i].resize(i+1);
        for(int j = 0; j <= i; j++){
            cin >> triangle[i][j];
        }
    }

    for(int i = num -2; i >= 0; i--){
        for(int j = 0; j <= i; j++){
            triangle[i][j] += max(triangle[i+1][j], triangle[i+1][j+1]);
        }
    }

    cout << triangle[0][0] << endl;


}