#include <iostream>
#include <ctime>
#include <list>
#include <vector>
#include <cstdlib>
#include <fstream>
using namespace std;

void fill(vector<int> &l, int size){
    for(int i = 0; i<size; i++){
        l.push_back(i);
    }
}
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size  = atoi(argv[1]);
    vector<int> v;
    fill(v, size);

    start = clock();
    v.insert(v.begin(),0);
    end = clock(); 

    
    double time = (double)(end-start)/CLOCKS_PER_SEC;
    cout << time;
}