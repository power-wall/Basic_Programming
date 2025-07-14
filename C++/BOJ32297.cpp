#include <iostream>

using namespace std;

int main(){
    int num;
    cin >> num;

    char str[num];
    for(int i = 0;  i < num; i++){
        cin >> str[i];
    }

    bool find = false;
    for(int i = 0; i <= num-4; i++){
        if(str[i] == 'g' && str[i+1] == 'o' && str[i+2] == 'r' && str[i+3] == 'i'){
            find = true;
            break;
        }
    }

    if (find) {
        cout << "YES\n";
    } else {
        cout << "NO\n";
    }



    return 0;

    

    

}