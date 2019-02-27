#include <iostream>
#include <ctime>
#include <list>
#include <vector>
#include <cstdlib>
using namespace std;

void fill(list<int> & l, int size){
    for(int i = 0; i<size; i++){
        l.push_back(i);
    }
}
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size  = atoi(argv[1]);
    list<int> l;
    fill(l ,size);

    start = clock();
    l.push_front(0);
    end = clock(); 

    
    double time = (double)(end-start)/CLOCKS_PER_SEC;
    cout << time;
}