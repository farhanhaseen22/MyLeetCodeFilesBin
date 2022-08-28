// #include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int maxSumSubmatrix(vector<vector<int>>& m, int k) {
    int res = INT_MIN, rows = m.size(), cols = m[0].size();
    for (int l = 0; l < cols; ++l) {
        vector<int> sums(rows);
        for (int r = l; r < cols; ++r) {
            for (int i = 0; i < rows; ++i) 
                sums[i] += m[i][r];
            set<int> s = {0};
            int run_sum = 0;
            for (int sum : sums) {
                run_sum += sum;
                auto it = s.lower_bound(run_sum - k);
                if (it != end(s))
                    res = max(res, run_sum - *it);
                s.insert(run_sum);
            }
        }
    }
    return res;
}

int main(int argc, char const *argv[])
{
    int rows=2, cols=3;
    int k = 2;
    int mat[rows][cols] = {
        {1,2,2},
        {0,-2,3}
    };
    vector<vector<int>> mainVector;
 
    for(int i = 0; i < rows; i++) {
        vector<int> subVector;
        for(int j = 0; j < cols; j++) {
            subVector.push_back(mat[i][j]);
        }
        mainVector.push_back(subVector);
    }
    
    int res = maxSumSubmatrix(mainVector,k);
    cout<<res;

    return 0;
}
