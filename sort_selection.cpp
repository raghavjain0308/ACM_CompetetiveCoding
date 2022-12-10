
#include <iostream>

using namespace std;
void reverse(int arr[], int j , int i){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
void sortArray(int arr[], int size){
    for(int i=0; i<size-1; i++){
        for(int j=i+1; j<size; j++){
            if(arr[j]<arr[i]){
                reverse(arr, j, i);
            }
        }
    }
}
void printArray(int arr[], int size){
    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }
}
void inputArray(int arr[], int size){
    for(int i=0; i<size; i++){
        cout<<" \nEnter "<<i+1<<"th elment: ";
        cin>>arr[i];
    }
}


int main()
{  int size;
   cin>>size;
   int arr[size];
   inputArray(arr,size);
   sortArray(arr,size);
   printArray(arr,size);

    return 0;
}