#include<iostream>
using namespace std;

void merge(int *arr,int s,int e,int mid){
  int l1=mid-s+1;
  int l2=e-mid;

  int *arr1=new int[l1];
  int *arr2=new int[l2];
  
 int k=s;
  for(int i=0;i<l1;i++){
    arr1[i]=arr[k];
    k++;
  }
 k=mid+1;
  for(int i=0;i<l2;i++){
    arr2[i]=arr[k];
    k++;
  }
int i=0,j=0;
k=s;
while(i<l1 && j<l2){
    if( arr1[i]<arr2[j]){
        arr[k++]=arr1[i++];
    }
    else{
        arr[k++]=arr2[j++];
    }
}
while(i<l1){
 arr[k++]=arr1[i++];
}
while(j<l2){
    arr[k++]=arr2[j++];
}



}
void mergesort(int *arr,int s,int e){
     //base case
      if(s==e){
        return;
      }
     
     int mid=(s+e)/2;
     //sortLeft 
     mergesort(arr,s,mid);
     //sort Right
     mergesort(arr,mid+1,e);
   

   merge(arr,s,e,mid);

     

}
int main(){
    int arr[]={2,46,8,10,7,10,24,102829,3,-1,0,1233456};
    int s= 0;
    int e= 11;
mergesort(arr,s,e);

for(int i=0;i<12;i++){
    cout<<arr[i]<<" ";
}


    return 0;
}