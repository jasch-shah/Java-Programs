#include <iostream>
#include <bits/stdc++.h>
using namespace std;
 
// Returns the number of we can split
// the string
int countWays(string s)
{
    int count[26] = { 0 };
 
    // Finding the frequency of each
    // character.
    for (char x : s)
        count++;
 
    // making frequency of first character
    // of string equal to 1.
    count[s[0] - 'a'] = 1;
 
    // Finding the product of frequency 
    // of occurrence of each character.
    int ans = 1;
    for (int i = 0; i < 26; ++i)
        if (count[i] != 0)
            ans *= count[i];
 
    return ans;
}
 
// Driven Program
int main()
{
    string s = "acbbcc";
    cout << countWays(s) << endl;
    return 0;
}