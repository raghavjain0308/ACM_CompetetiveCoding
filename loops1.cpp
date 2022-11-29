#include<iostream>
using namespace std;
int main(){
    int n;
    int sum=0;
    cout<<"Input integer :"<<endl;
    cin>>n;
    for(int i=1;i<=n;i++){
        sum=sum+i;
        cout<<sum;
    }
    cout<<"Sum of all integers till "<< n <<" is : "<<sum<<endl;
    return 0;
}