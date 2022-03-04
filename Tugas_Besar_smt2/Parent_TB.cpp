#include "Parent_TB.h"
#include <iostream>

void createList(List_P &L){
    first(L) = NULL;
    last(L) = NULL;
}
address_P alokasi(Deskripsi x){
    address_P P = new elm_P;
    info(P).Nama = x.Nama;
    info(P).Pendiri = x.Pendiri;
    info(P).Tahun = x.Tahun;
    info(P).Deskription = x.Deskription;
    info(P).Laba_Tahun2019 = x.Laba_Tahun2019;
    info(P).Laba_Tahun2020 = x.Laba_Tahun2020;
    next(P) = NULL;
    prev(P) = NULL;
    return P;
}
void insertFirst(List_P &L, address_P P){
    if(first(L) == NULL){
        first(L) = P;
        last(L) = P;
        next(P) = first(L);
        prev(P) = first(L);
    }else {
        next(P) = first(L);
        next(last(L)) = P;
        prev(first(L)) = P;
        first(L) = P;
        prev(P) = last(L);

    }
}
void insertLast(List_P &L, address_P P){
    if(first(L) == NULL){
        first(L) = P;
        last(L) = P;
        next(P) = first(L);
        prev(P) = last(L);
    }else {
        next(last(L)) = P;
        prev(last(L)) = P;
        last(L) = P;
        prev(P) = first(L);
        next(P) = first(L);
    }
}
void deleteFirst(List_P &L, address_P &P){
    if(first(L) == NULL){
        cout<<"empty"<<endl;
    }else if(next(first(L)) == first(L)) {
        P = first(L);
        first(L) = NULL;
    }else {
        P = first(L);
        first(L) = next(P);
        next(last(L)) = first(L);
        prev(P) = NULL;
        prev(first(L)) = last(L);
        next(P) = NULL;
    }
}
void deleteLast(List_P &L, address_P &P){
    if(first(L) == NULL){
        cout<<"empty"<<endl;
    }else if(next(first(L)) == first(L)){
        P = first(L);
        first(L) = NULL;
        last(L) = NULL;
    }else {
        P = last(L);
        last(L) = prev(P);
        next(last(L)) = first(L);
        prev(first(L)) = last(L);
        next(P) = NULL;
        prev(P) = NULL;
    }
}
address_P findElement(List_P L,string a){
    address_P P = first(L);
    while(info(P).Nama != a) {
        P = next(P);
    }
    if(info(P).Nama == a){
        return P;
    }else {
        return NULL;
    }
}
void printInfo(List_P L){
    address_P P = first(L);
    if(next(P) == first(L)){
        cout<<endl;
        cout<<"Nama Perusahaan   : "<<" ";
        cout<<info(P).Nama   <<" ";
        cout<<endl;
        cout<<"Pendiri           :"<<"  ";
        cout<<info(P).Pendiri<<" ";
        cout<<endl;
        cout<<"Tahun Berdiri     :"<<" ";
        cout<<info(P).Tahun  <<" ";
        cout<<endl;
        cout<<"Bergerak dibidang :"<<"  ";
        cout<<info(P).Deskription<<" ";
        cout<<endl;
        P = next(P);
    }else {
        while(next(P) != first(L)){
            cout<<endl;
            cout<<"Nama Perusahaan   : "<<" ";
            cout<<info(P).Nama<<"  ";
            cout<<endl;
            cout<<"Pendiri           :"<<" ";
            cout<<info(P).Pendiri<<"  ";
            cout<<endl;
            cout<<"Tahun Berdiri     :"<<" ";
            cout<<info(P).Tahun<<"  ";
            cout<<endl;
            cout<<"Bergerak dibidang :"<<"  ";
            cout<<info(P).Deskription<<" ";
            cout<<endl;
            P = next(P);
        }
        cout<<endl;
        cout<<"Nama Perusahaan   : "<<" ";
        cout<<info(P).Nama<<"  ";
        cout<<endl;
        cout<<"Pendiri           :"<<" ";
        cout<<info(P).Pendiri<<" ";
        cout<<endl;
        cout<<"Tahun Berdiri     :"<<" ";
        cout<<info(P).Tahun<<"  ";
        cout<<endl;
        cout<<"Bergerak dibidang :"<<"  ";
        cout<<info(P).Deskription<<" ";
        cout<<endl;
    }

}
void Perusahaan_Profit(List_P L, Deskripsi x){
     Cuan arr[6];
     int i, j, idxmax;
     time_t currentTime;
     Cuan temp;
     address_P P;
     P = first(L);
     i = 0;
     while(next(P) != first(L)){
        arr[i].perusahaan = info(P).Nama;
        arr[i].cuan_lalu = info(P).Laba_Tahun2019;
        arr[i].cuan_sekarang = info(P).Laba_Tahun2020;
        P = next(P);
        i = i + 1;
     }
    arr[i].perusahaan = info(P).Nama;
    arr[i].cuan_lalu = info(P).Laba_Tahun2019;
    arr[i].cuan_sekarang = info(P).Laba_Tahun2020;
    i = 0;
    while(i <= 5){
        j = i;
        idxmax = i;
        while(j <= 5){
            if(arr[idxmax].cuan_sekarang < arr[j].cuan_sekarang){
                idxmax = j;
            }
            j = j + 1;
        }
        temp.cuan_sekarang = arr[idxmax].cuan_sekarang;
        temp.perusahaan = arr[idxmax].perusahaan;
        temp.cuan_lalu = arr[idxmax].cuan_lalu;
        arr[idxmax].cuan_sekarang = arr[i].cuan_sekarang;
        arr[idxmax].perusahaan = arr[i].perusahaan;
        arr[idxmax].cuan_lalu = arr[i].cuan_lalu;
        arr[i].cuan_sekarang = temp.cuan_sekarang;
        arr[i].perusahaan = temp.perusahaan;
        arr[i].cuan_lalu = temp.cuan_lalu;
        i = i+1;
    }
    cout<<"=================================================================="<<endl;
    cout<<"                                                                  "<<endl;
    cout<<"               -THE MOST PROFITABLE MULTINATIONAL COMPANY-        "<<endl;
    cout<<"              According to IMF(International Monetary Fund)       "<<endl;
    cout<<"                               [2020]                             "<<endl;
    cout<<"                                                                  "<<endl;
    cout<<"=================================================================="<<endl;
    i = 0;
    time(&currentTime);
    cout<<"[Data Ter-Update UTC : ]"<<endl;
    printf("%s\n",ctime(&currentTime));
    cout<<"^"<<endl;
    cout<<"|_ _ _ _ _ _ _ _ _ _ _ _"<<endl;
    cout<<"|                     | |"<<endl;
    cout<<"|                     | |"<<endl;
    cout<<"|_ _ _ _ _ _ _ _      | |"<<endl;
    cout<<"|             | |     | |"<<endl;
    cout<<"|             | |     | |"<<endl;
    cout<<"| _ _ _ _     | |     | |"<<endl;
    cout<<"|      | |    | |     | |"<<endl;
    cout<<"|      | |    | |     | |"<<endl;
    cout<<"|      | |    | |     | |"<<endl;
    cout<<"|_ _ _ |_| _ _|_|_ _ _|_| _ __ >"<<endl;
    cout<<"       3rd    2nd     1st"<<endl;
    cout<<"Kuartal I [2020]"<<endl;
    cout<<endl;
    while(i <= 2){
        cout<<"Nama Perusahaan Top-"<<i+1<<endl;
        cout<<arr[i].perusahaan<<endl;
        cout<<"Dengan Laba sebesar :"<<endl;
        cout<<"$"<<arr[i].cuan_sekarang<<endl;
        cout<<endl;
        i = i + 1;
    }
}
