#include <iostream>
#include <ctime>
#include <vector>
#include <cstdlib>
#include <algorithm>
using namespace std;

void fill(vector<int> &list, int size){
    for(int i = 0; i<size; i++){
        int num = rand()%size+1;
        list.push_back(num);
    }
}

int rangeQuadratic(vector<int> &list){
    int maxDiff = 0;
    for(int i = 0; i< list.size(); i++){
        for(int j = i + 1; j < list.size(); j++){
            int diff = abs(list[j] - list[i]);
            maxDiff = max(maxDiff, diff);
        }
    }
    return maxDiff;
}
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size = atoi(argv[1]);
    vector<int> list;
    fill(list, size);

    start = clock();
    rangeQuadratic(list);
    end = clock();
    cout << (double)(end-start)/CLOCKS_PER_SEC;
}