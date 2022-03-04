#include "Rel_J.h"
#include <iostream>
void connect2(address_P &P, address_J &D){
    address_P d;
    if(P != NULL && D != NULL){
        parent2(d) = P;
    }
}
void disconnect2(address_J &D){
    address_P d;
    if(D !=NULL){
        parent2(d) = NULL;
    }
}
void printRelasi2(List_P L, List_J L3){
    address_P P;
    address_J C;
    P = first(L);
    while(next(P) != first(L)){
        cout<<endl;
        cout<<"Nama Perusahaan   : "<<" ";
        cout<<info(P).Nama   <<" ";
        C = first(L3);
        while(C != NULL){
            if(parent2(C) == P){
                cout<<"Daftar Jasa :"<<endl;
                cout<<info(C).Jasa<<endl;
            }
            C = next(C);
        }
        P = next(P);
        cout<<endl;
    }
    cout<<endl;
    cout<<"Nama Perusahaan   : "<<" ";
    cout<<info(P).Nama   <<" ";
    cout<<endl;
    C = first(L3);
    while(C != NULL){
        if(parent2(C) == P){
          cout<<"Daftar Jasa :"<<endl;
          cout<<info(C).Jasa<<endl;
        }
        C = next(C);
    }
}
