#include "Child2_TB.h"
#include <iostream>

void createList2(List_J &L3){
    first(L3) = NULL;
}
address_J alokasi2(Data_Jasa D){
    address_J P = new elm_J;
    info(P).Jasa = D.Jasa;
    next(P) = NULL;
    parent(P) = NULL;
    return P;
}
void insertFirstChild2(List_J &L3, address_J P){
    if(first(L3) == NULL){
        first(L3) = P;
    }else {
        next(P) = first(L3);
        first(L3) = P;
    }
}
void insertLastChild2(List_J &L3, address_J C){
    address_J Q = first(L3);
    while(next(Q) != NULL){
        Q = next(Q);
    }
    next(Q) = C;

}
void deleteLast2(List_J &L3, address_J &P){
    address_J Q = first(L3);
    while(next(next(Q)) != NULL){
        Q = next(Q);
    }
    P = next(Q);
    next(Q) = NULL;
}
void deleteFirst2(List_J &L3, address_J &P){
    if(first(L3) == NULL){
        cout<<"empty"<<endl;
    }else{
        P = first(L3);
        first(L3) = next(P);
        next(P) = NULL;
    }
}
address_J FindElementChild3(List_J L3, string b){
    address_J C = first(L3);
    while(C != NULL && info(C).Jasa != b){
        C = next(C);
    }
    if(info(C).Jasa == b){
        return C;
    }else{
        return NULL;
    }

}


