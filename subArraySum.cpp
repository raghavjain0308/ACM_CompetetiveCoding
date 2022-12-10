#include<iostream>
using namespace std;

void inputArray(int arr[], int n){
    for(int i=0; i<n; i++){
        cin>>arr[i];
        
    }
    cout<<endl;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    inputArray(arr,n);
   
    for(int i=0; i<n; i++){
         int sum=0;
        for(int j=i; j<n; j++){
           
            sum = sum + arr[j];
            cout<<sum;
            cout<<endl;
        }
    }
    return 0;
}