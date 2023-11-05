#include<iostream>
using namespace std;
static int ans=-1; 
int lastoccurence(string str,char key,int i){
     
      if(i==str.length()){
        return ans ;
    }
    
    if(str[i]==key)
    ans=i;
   
    ans=lastoccurence(str,key,i+1);
    return ans;
};
int main(){
    string a="aaddbshsmjddfh";
    cout<<lastoccurence(a,'j',0)<<endl;

    return 0;
}