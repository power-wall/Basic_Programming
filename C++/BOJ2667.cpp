/*
https://www.acmicpc.net/problem/2667
단지번호 붙이기

정사각형 지도에 0 과 1
1은 집 0은 비어있음, 상하좌우가 붙어있으면 단지
단지수를 출력하고, 단지 속 집의 수를 오름차순으로 출력

입력
N 정사각형 크기
매트릭스
*/

#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

struct coor{
    int arr[2];
};

int num;
typedef vector<vector<char>> matrix;
typedef vector<vector<bool>> check_matrix;
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};

int bfs(matrix &square, check_matrix &check_square, int x, int y){
    check_square[x][y] = true;
    queue<coor> q;
    q.push({x,y});
    int house_cnt = 1;

    while (!q.empty())
    {
        coor current = q.front();
        q.pop();
        int nx = current.arr[0];
        int ny = current.arr[1];

        for(int i = 0; i < 4; i++){
            int mx = nx + dx[i];
            int my = ny + dy[i];

            if(mx >= 0 && mx < num && my >= 0 && my < num && square[mx][my] == '1' && check_square[mx][my] == false){
                check_square[mx][my] = true;
                q.push({mx,my});
                house_cnt++;
            }


        }

    }
    
    return house_cnt;
    
}

int main(){
    cin >> num;

    matrix square(num, vector<char>(num));
    for(int i = 0; i < num; i++){
        for(int j = 0; j < num; j++){
            cin >> square[i][j];
        }
    }

    int cnt = 0;
    vector<int> house_arr;
    check_matrix check_square(num, vector<bool>(num, false));
    for(int i = 0; i < num; i++){
        for(int j = 0; j <num; j++){
            if(square[i][j] == '1' && check_square[i][j] == false){
                int house_cnt = bfs(square, check_square, i, j);
                house_arr.push_back(house_cnt);
                cnt++;
            }
        }
    }

    sort(house_arr.begin(), house_arr.end());
    cout << cnt << endl;
    for(int i : house_arr){
        cout << i << endl;
    }


}