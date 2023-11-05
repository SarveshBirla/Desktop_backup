#include<iostream>
using namespace std;

int partition(int *arr,int s,int e){
    int pivotIndex = s;
    int Pivot=arr[pivotIndex];
    int count=0;


    for(int i=s+1;i<=e;i++){
        if(Pivot>=arr[i]){
           count++;
        }
    }
    pivotIndex=s+count;
    swap(arr[pivotIndex],arr[s]);
     
     int i=s;
     int j=e;
    while(i<pivotIndex && j>pivotIndex){
        while(arr[i]<=Pivot){
          i++;
        }
        while(arr[j]>Pivot){
            j--;
        }

        if(i<pivotIndex && j>pivotIndex){
            swap(arr[i],arr[j]);
        }
    }

    return pivotIndex;



}

void QuickSort(int *arr,int s,int e){

if(s>=e){
    return;
}

int p=partition(arr,s,e);


//Quicksort left
QuickSort(arr,s,p-1);
//Quicksort right;
QuickSort(arr,p+1,e);

}


int main(){
int arr[]={20,4,7,18,13,45,23,46,80,29,10,23,34,56,78,90,22,2,2,3,3,4,5};
int s=0;
int e=22;

QuickSort(arr,s,e);

for(int i=0;i<=22;i++){
    cout<<arr[i]<<" ";
}
cout<<endl;
    return 0;
}