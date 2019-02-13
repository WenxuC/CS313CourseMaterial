#include <iostream>
#include <ctime>
#include <list>
#include <vector>
#include <cstdlib>
#include <fstream>
using namespace std;
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size  = atoi(argv[1]);
    //List in c++ is a doubly linkedlist
    //Inserting into the front of a linkedlist takes O(1)
    vector<int> v;
    start = clock();
    vector<int>::iterator it; // an iterator for the first elements location
    for (int i = 1; i <= size; ++i){
        it = v.begin(); // find the location of the first element
        v.insert(it,i);
    }
    end = clock(); 
    double time = (double)(end-start)/CLOCKS_PER_SEC;
    cout << time;
}