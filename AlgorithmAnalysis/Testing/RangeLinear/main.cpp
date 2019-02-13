#include <iostream>
#include <ctime>
#include <vector>
#include <cstdlib>
#include <algorithm>
using namespace std;

void fill(vector<int> &list, int size){
    for(int i = 1; i<=size; i++){
        int num = rand()%size+1;
        list.push_back(num);
    }
}

int rangeLinear(vector<int> & list){
    int hi = INT_MIN;
    int lo = INT_MAX;
    for(int i = 1; i<=list.size(); i++){
        hi = max(hi, list[i]);
        lo = min(lo, list[i]);
    }
    return hi - lo;
}
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size = atoi(argv[1]);
    vector<int> list;
    fill(list, size);

    start = clock();
    rangeLinear(list);
    end = clock();
    cout << (double)(end-start)/CLOCKS_PER_SEC;
}