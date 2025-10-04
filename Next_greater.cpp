#include<iostream>
#include<stack>
#include<vector>
using namespace std;

void Next(int arr[] ,int n,vector<int> &v){
    stack<int>s;
    int i;
    for(i = n - 1;i>=0;i--){
        while (!s.empty() && arr[i]>= s.top()){
            s.pop();
    }
        if(s.empty()){
            v[i] = -1;
        }else{
            v[i] = s.top();
        }
        s.push(arr[i]);
    }
    
}

int main(){
    int arr[] = {6,8,0,1,3};
    int n = sizeof(arr)/sizeof(arr[0]);
    vector<int> v(n,0);

    Next(arr,n,v);
    for(int ans: v){
        cout<<ans<<" ";
    }

    return 0;
}