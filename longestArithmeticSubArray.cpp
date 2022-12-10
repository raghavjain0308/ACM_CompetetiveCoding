#include<iostream>
using namespace std ;

void inputArray(  int arr[],int n){
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    inputArray(arr,n);
   int prev_diff = arr[1]-arr[0];
   int max_lenght = 2;
    int curr_diff;
    int curr_lenght=2;
   for(int i=2; i<n; i++){
    int next = i+1;
   
  
    if(next<n){
        curr_diff =arr[next]-arr[i];
         
    }
    if(curr_diff==prev_diff){
      prev_diff=curr_diff;
       curr_lenght++;
    }
    else{
        prev_diff=curr_diff;
        curr_lenght = 2;
    }
    if(curr_lenght>max_lenght){
        max_lenght=curr_lenght;
    }
}
cout<<max_lenght;
    return 0;
}