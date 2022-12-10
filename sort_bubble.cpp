
#include <iostream>

using namespace std;

void reverse(int arr[], int i , int j){
    int temp= arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}
void sortArray(int arr[], int size){
    int counter = 1;
    while(counter<size){
        for(int i=0; i<size-counter; i++){
            if(arr[i]>arr[i+1]){
                reverse(arr, i, i+1);
            }
        }
        counter++;
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