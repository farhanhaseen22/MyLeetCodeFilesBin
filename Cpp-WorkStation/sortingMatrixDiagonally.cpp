#include <bits/stdc++.h>
#include <vector>
using namespace std;

vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
    int r = mat.size();
    int c = mat[0].size();
    int rowIndex = 0; // row Index for diagonal
    int colIndex; // col Index for diagonal
    int numberOfDiagonals = r+c-1;

    for(int i=1;i<=numberOfDiagonals;++i){
        vector<int> diagonal; // vector for storing diagonal elements
        
        /*
            All the first c diagonals have common starting rowIndex = 0 
            Only colIndex changes
        */
        if(i<=c){
            colIndex = c-i;
        }
        
        // After that starting colIndex is constant and rowIndex changes
        else{
            rowIndex++;
            colIndex = 0;
        }
        
        for(int i=rowIndex,j=colIndex;i<r && j<c;++i,++j){
            diagonal.push_back(mat[i][j]);
        }
        
        sort(diagonal.begin(),diagonal.end());
        
        for(int i=rowIndex,j=colIndex,k=0;i<r && j<c;++i,++j,++k){
            mat[i][j] = diagonal[k];
        }
    }
    return mat;
}

int main(int argc, char const *argv[])
{
    // vector<vector<int>> mat {{3,3,1,1},{2,2,1,2},{1,1,1,2},{1,1,2,4}};
    vector<vector<int>> mat {
        {5,17,4,1,52,7},
        {11,11,25,45,8,69},
        {14,23,25,44,58,15},
        {22,27,31,36,50,66},
        {84,28,75,33,55,68}
    };
    
    vector<vector<int>> result_mat = diagonalSort(mat);

    int run_once = 1;
    for (const vector<int>& vecs : result_mat){
        if(run_once==1){
            for (int i=0; i < (vecs.size()-1); i++){
                cout << " -----";
            }
            cout << endl;
            run_once++;
        }
        cout << " | ";
        for (const int& num : vecs){
            cout << num << " | ";
        }
        cout << endl;
        for (int i=0; i < (vecs.size()-1); i++){
            cout << " -----";
        }
        cout << endl;
    }

    return 0;
}
