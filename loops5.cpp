#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<" input an integer"<<endl;
    cin>>n;
    int i;
    for( i=2;i<n;i++){
        if(n%i==0){
            cout<<" not prime";
            break;
        }
    }
    if(i==n){
      cout<<"prime"<<endl;
    }
    
    return 0;
}