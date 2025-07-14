/*
https://www.acmicpc.net/problem/1149
RGB거리

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

최소 비용 구해라
*/

#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int main(){

    int num;
    cin >> num;

    vector<vector<int>> cost(num, vector<int>(3));
    for(int i = 0; i < num; i++){
        for(int j = 0; j < 3; j++){
            cin >> cost[i][j];
        }
    }

    int dp[num][3];
    dp[0][0] = cost[0][0];
    dp[0][1] = cost[0][1];
    dp[0][2] = cost[0][2];

    for(int i = 1; i < num; i++){
        dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
        dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
        dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
    }

    int result = min(min(dp[num-1][0], dp[num-1][1]), dp[num-1][2]);

    cout << result << endl;




    return 0;
}