#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  if (n==c)
    cout<<c+1;
  else{
  while(n!=0)
  {
    n=n/10;
    c++;
  }
  cout<<c;}
}