#include<iostream>
#include<vector>
#include<queue>
using namespace std;

class Node{
public:
    int val;
    Node* left;
    Node * right;
    Node(int data){
        val = data;
        left = right = NULL;
    }
};
static int idx = -1;
// preorder
Node* buildTree(vector<int> preorder){
    idx++;
    if(preorder[idx] == -1) return NULL;
    Node* root = new Node(preorder[idx]);

    root->left = buildTree(preorder);
    root->right = buildTree(preorder);
    return root;
}
//root, left, right
void preOrder(Node* root){// Pre order traversal
    if(root == NULL){
        cout<<-1<<" ";// null as -1
        return;
    }
    cout<<root->val<<" ";
    preOrder(root->left);
    preOrder(root->right);
}
// left, root , right
void inOrder(Node* root){
    if(root == NULL){
        return;
    }
    inOrder(root->left);
    cout<<root->val<<" ";
    inOrder(root->right);
}
// left, right , root
void postOrder(Node * root){
    if(root == NULL){
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    cout<<root->val<<" ";

}
// one line
void levelOrder(Node* root){
    queue<Node*>q;
    q.push(root);
    while (q.size()>0)
    {
        Node* curr = q.front();
        q.pop();
        cout<<curr->val<<" ";
        if(curr->left != NULL){
            q.push(curr->left);
        }
        if(curr->right != NULL){
            q.push(curr->right);
        }

    }
    cout<<endl;
    
}

void levlOrder(Node* root){
    queue<Node*>q2;
      q2.push(root);
      q2.push(NULL); 
     while (q2.size()>0)
     {
        Node* curr = q2.front();
        q2.pop();
        if(curr == NULL){
            if(!q2.empty()){
                cout<<endl;
                q2.push(NULL);
                continue;
            }
            else{
                break;
            }
        }
        cout<<curr->val<<" ";
        if(curr->left != NULL){
            q2.push(curr->left);
        }
        if(curr->right != NULL){
            q2.push(curr->right);
        }
     }
     

}

//Height 
 int height(Node* root){
    if(root == NULL){
        return 0;
    }
    int left = height(root->left);
    int right = height(root->right);
    return max(left,right) + 1;

 }

 //No of node of a tree
 int count(Node* root){
    if(root == NULL){
        return 0;
    }

    int lefcnt = count(root->left);
    int rigcnt = count(root->right);
    return lefcnt + rigcnt + 1;
 }
 //Sum of all nodes datas
 int sum(Node* root){
    if(root == NULL){
        return 0;
    }
    int leftSum = sum(root->left);
    int rightSum = sum(root->right);
    return leftSum + rightSum + root->val;
 }

int main(){
  vector<int> preorder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
  Node* root = buildTree(preorder);
  preOrder(root);
  cout<<endl;
  inOrder(root);
  cout<<endl;
  postOrder(root);
  cout<<endl;
  levelOrder(root);
     cout<<endl;
     levlOrder(root);

     cout<<endl;
     cout<<height(root)<<endl;
     cout<<count(root)<<endl;
     cout<<sum(root)<<endl;
  return 0;
}