#include<iostream>
using namespace std;
int main(){
    int a,b;
    cout<<" Input two integers a & b (such that b>a): "<<endl;
    cin>>a>>b;
    int j;
    for(int i=a;i<=b;i++){
        for( j=2;j<i;j++){
            if(i%j==0){
                break;
            }
            
        }
        if(j==i){
                cout<<i<<endl;
        }
    }
    return 0;

}