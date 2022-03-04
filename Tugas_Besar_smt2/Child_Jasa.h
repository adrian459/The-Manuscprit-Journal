#ifndef CHILD_JASA_H_INCLUDED
#define CHILD_JASA_H_INCLUDED

#include <iostream>
#include "Parent_TB.h"

using namespace std;
#define first(L) L.first
#define next(P) P->next
#define info(P) P->info
#define parent2(d) d->parent2


struct Data_Jasa{
    string Jasa;
};
typedef struct elm_J *address_J;
struct elm_J{
    Data_Jasa info;
    address_J next;
    address_P parent2;

};
struct List_J{
    address_J first;
};

void createList2(List_J &L3);
address_J alokasi2(Data_Jasa D);
void insertFirstChild2(List_J &L3, address_J P);
void insertLastChild2(List_J &L3, address_J P);
void deleteFirst2(List_J &L3, address_J &P);
void deleteLast2(List_J &L3, address_J &P);
address_J FindElementChild3(List_J L3, string a);



#endif // CHILD_JASA_H_INCLUDED
