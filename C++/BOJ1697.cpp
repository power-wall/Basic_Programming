/*
https://www.acmicpc.net/problem/1697
숨바꼭질

빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 
순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
빠른 시간 구해라

수빈이 위치 N, 동생 위치 K
*/

#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int MAX = 100001;

int main(){
    int N, K;
    cin >> N >> K;

    vector<int> visited(MAX, 0);
    queue<int> queue;

    queue.push(N);
    visited[N] = 1;

    while (!queue.empty())
    {
        int recent = queue.front();
        queue.pop();

        if(recent == K){
            cout << visited[recent] - 1 << endl;
            break;
        }

        for(int next : {recent + 1, recent - 1, 2*recent}){
            if(next >= 0 && next < MAX && visited[next] == 0){
                visited[next] = visited[recent] + 1;
                queue.push(next);
            }
        }
    }
    

    return 0;

    
}

