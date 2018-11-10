#include <iostream>
#include <vector>
#include <map>
using namespace std;

int main() {
	int t;cin >> t;
	while(t--){
	    string s;cin >> s;
	    map<char,int> m;
	    vector<int> v;
	    for(int i=0;i<s.length();i++){
	        if(!m[s[i]]){
	            v.push_back(s[i]);
	            m[s[i]]++;
	            //cout<<"map object "<<i<<" are "<<m[s[i]]<<endl;
	            //cout<<"vector contents at iteration "<<v[i]<<endl;

	        }
	    }
	    sort(v.begin(),v.end(),greater<int> () );
	    for(int i=0;i<v.size();i++)
	    	cout<<v[i]<<"\t";


	    int ma=0;
	    for(int i=1;i<=13;i++){
	        for(int j=0;j<v.size();j++){
	            int c=1,k=j+1;
	            int a = j;
	            while(k<v.size()){
	                if(v[k]==v[a]-i){
	                    c++;
	                    a = k;
	                }
	                k++;
	                if(c>ma) ma = c;
	            }
	        }
	    }
	    vector<int> ans;
	    for(int i=1;i<=13;i++){
	        for(int j=0;j<v.size();j++){
	            int c=1,k=j+1;
	            int a = j;
	            ans.push_back(v[j]);
	            while(k<v.size()){
	                if(v[k]==v[a]-i){
	                    c++;
	                    a = k;
	                    ans.push_back(v[k]);
	                }
	                k++;
	                if(c==ma) {
	                    goto x;
	                }
	            }
	            ans.clear();
	        }
	    }
	    x:
	        for(int i=0;i<ans.size();i++) {
	            char z = ans[i];
	            cout << z;
	        }
	        cout << endl;
	} 
	return 0;
}