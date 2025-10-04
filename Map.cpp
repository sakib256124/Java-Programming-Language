#include<bits./stdc++.h>
using namespace std;

int main() {

    map<string, int> students;

    students["sakib"] = 30;
    students["rakib"] = 40;
    students["rakat"] = 50;
    cout<<"students age "<<students["rakib"] <<endl;
    // Travar
    for(auto &pair : students){
        cout<<pair.first <<" -> "<<pair.second<<endl;
    }

    if(students.find("skib") != students.end()){
        cout<<" found "<<endl;
    }else{
        cout<<" Not Found "<<endl;
    }
    return 0;
}