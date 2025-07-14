/*
https://www.acmicpc.net/problem/1991
트리 순회
이진트리 입력
전위, 중위, 후위 순회 한 순으로 출력
*/

#include <iostream>
#include <unordered_map>

using namespace std;

struct Node{
    char data;
    Node* left;
    Node* right;

    Node(char c) : data(c), left(nullptr), right(nullptr) {}
};

unordered_map<char, Node*> tree;

void preorder(Node* node){
    if(!node){
        return;
    }
    cout << node -> data;
    preorder(node -> left);
    preorder(node -> right);
}

void inorder(Node* node){
    if(!node){
        return;
    }
    inorder(node -> left);
    cout << node -> data;
    inorder(node -> right);
}

void postorder(Node* node){
    if(!node){
        return;
    }
    postorder(node -> left);
    postorder(node -> right);
    cout << node -> data;
}


int main(){
    int num;
    cin >> num;

    for(int i = 0; i<num; i++){
        char root, left, right;
        cin >> root >> left >> right;

        if(tree.find(root) == tree.end()){
            tree[root] = new Node(root);
        }

        if(left != '.'){
            if(tree.find(left) == tree.end()){
                tree[left] = new Node(left);
            }

            tree[root] -> left = tree[left];

        }

        if(right != '.'){
            if(tree.find(right) == tree.end()){
                tree[right] = new Node(right);
            }

            tree[root] -> right = tree[right];

        }

    }

    Node* root = tree['A'];
    preorder(root);
    cout << "\n";
    inorder(root);
    cout << "\n";
    postorder(root);
    cout << "\n";

    return 0;

}