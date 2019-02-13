#include <iostream>
#include <ctime>
#include <list>
#include <vector>
#include <cstdlib>
using namespace std;
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size  = atoi(argv[1]);
    //List in c++ is a doubly linkedlist
    //Inserting into the front of a linkedlist takes O(1)
    list<int> l;
    start = clock();
    for (int i = 1; i <= size; ++i)
        l.push_front(i);
    end = clock(); 
    double time = (double)(end-start)/CLOCKS_PER_SEC;
    cout << time;
}