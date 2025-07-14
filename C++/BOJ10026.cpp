/*
https://www.acmicpc.net/problem/10026
적록색약

N*N 구역 구별
*/

#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct geo
{
    int arr[2];
};

typedef vector<vector<char>> matrix;
typedef vector<vector<bool>> check_matrix;

int N;
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};


void bfs(matrix &board, check_matrix &visited, int x, int y, bool isBlind){
    char color = board[x][y];
    queue<geo> q;
    q.push({x, y});
    visited[x][y] = true;

    while (!q.empty())
    {
        geo current = q.front();
        q.pop();
        int nx = current.arr[0];
        int ny = current.arr[1];

        for(int i = 0; i < 4; i++){
            int mx = nx + dx[i];
            int my = ny + dy[i];
            
            if(mx >= 0 && mx < N && my >= 0 && my < N && !visited[mx][my]){ // 색약 아님
                char nextColor = board[mx][my];

                if(!isBlind && nextColor == color){
                    visited[mx][my] = true;
                    q.push({mx, my});
                }

                if(isBlind){ //색약
                    if((color == 'R' || color == 'G') && (nextColor == 'R' || nextColor == 'G')){
                        visited[mx][my] = true;
                        q.push({mx, my});
                    }
                    else if(color == 'B' && nextColor == 'B'){
                        visited[mx][my] = true;
                        q.push({mx, my});
                    }
                }
            }
            

            
        }
    }
    
}

int main(){
    cin >> N;

    matrix board(N, vector<char>(N));
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            cin >> board[i][j];
        }
    }

    check_matrix visited(N, vector<bool>(N, false));

    int normal_cnt = 0;
    int blind_cnt = 0;

    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            if(!visited[i][j]){
                bfs(board, visited, i, j, false); // 색약 아님
                normal_cnt++;
            }
        }
    }


    visited = check_matrix(N, vector<bool>(N, false));
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            if(!visited[i][j]){
                bfs(board, visited, i, j, true); // 색약 아님
                blind_cnt++;
            }
        }
    }
    
    cout << normal_cnt << " " << blind_cnt << endl;

    return 0;

}