#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void inputArray(int arr[], int n){
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    inputArray(arr,n);
    int mx = -1;
    int rbd=0;
    if(n==1){
        rbd++;
        cout<<rbd;
        return 0;
    }
    for(int i=0; i<n; i++){
        
        if(  arr[i]>mx && ( (i+1<n) && (arr[i]>arr[i+1]))){
            rbd++;
            mx = max(mx,arr[i]);
        }
       
    }
    cout<<rbd;
    return 0;
}