#include <iostream>
#include <ctime>
#include <list>
#include <vector>
#include <cstdlib>
using namespace std;
   
int main (int argc, char**argv) {
    clock_t start, end;
    int size  = atoi(argv[1]);
    cout << "n = " << size << endl;
    //List in c++ is a doubly linkedlist
    //Inserting into the front of a linkedlist takes O(1)
    list<int> l;
    start = clock();
    for (int i = 1; i <= size; ++i)
        l.push_front(i);
    end = clock();
    cout << "list: " << (double)(end-start)/CLOCKS_PER_SEC << endl;
    
    //Inserting into the beginning of a vectors requires the elements in the vector
    //to shift over one to the right before the new element can be added
    //This takes O(N)
    vector<int> v;
    start = clock();
    vector<int>::iterator it; // an iterator for the first elements location
    for (int i = 1; i <= size; ++i){
        it = v.begin(); // find the location of the first element
        v.insert(it,i);
    }
    end = clock();
    cout << "vector: " << (double)(end-start)/CLOCKS_PER_SEC << endl;

}