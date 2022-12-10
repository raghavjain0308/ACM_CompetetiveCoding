#include<iostream>
#include <bits/stdc++.h>
using namespace std;
void printArray(int arr[], int n){
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}
void inputArray(int arr[], int n){
    for(int i=0;i<n; i++){
        cin>>arr[i];
    }
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    inputArray(arr,n);
    int max = INT_MIN;
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max=arr[i];
         }
        else{
            arr[i]=max;
        }
    }
     printArray(arr,n);

     return 0;
}