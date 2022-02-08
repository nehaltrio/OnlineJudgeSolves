

#include <iostream>
#include <bits/stdc++.h>
#include <vector>

using namespace std;

int
main ()
{
  
  vector<int> v;
  int N;
  
  cin>>N;
  
  for (int i = 0; i <N ; i++) {
      int x;
      cin>>x;
       v.push_back(x);
  }
  
  sort(v.begin(),v.end());
  
  for(int i=0; i < v.size(); i++){
   std::cout << v.at(i) << ' ';
  }
  
  return 0;
}
