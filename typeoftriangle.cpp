#include<iostream>
using namespace std;
int main(){
    int sidea,sideb,sidec;
    cout<<" enter sides of the triangle"<<endl;
    cin>> sidea >> sideb >> sidec;
    if(sidea==sideb && sideb==sidec){
        cout<<"EQUILATERAL TRIANGLE";
    }
    else if( sidea==sideb || sideb==sidec || sidec==sidea){
        cout<<"ISOCELES TRIANGLE";
    }   
    else{
        cout<<" SCALENE TRIANGLE";
    }
    return 0;
}