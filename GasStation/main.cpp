#include <iostream>
#include "core/store/Oil.h"
#include "core/store/Petrol.h"
#include "core/buisness/Order.h"

using namespace std;

float oilPrice;
Oil *oil;
Petrol *A80;
Petrol *A92;
Petrol *A95;

int rec(){
    string password = "password";
    string youEnter;
    cout<<"Please enter password:"<<endl;
    cin>>youEnter;
    if (youEnter == password){
        return 0;
    } else if(youEnter == "exit") {
        return 1;
    }
    else {
        cout<<"Wrong password"<<endl;
        rec();
    }
}

void help(){
    cout<<"Oil costs : "<<oil->getPrice()<<"$"<<endl;
    cout<<"A80 costs : "<<A80->getPrice()<<"$"<<endl;
    cout<<"A92 costs : "<<A92->getPrice()<<"$"<<endl;
    cout<<"A95 costs : "<<A95->getPrice()<<"$"<<endl<<endl;
    cout<<"Enter 1 to buy A80"<<endl;
    cout<<"Enter 2 to buy A92"<<endl;
    cout<<"Enter 3 to buy A95"<<endl;
    cout<<"Enter 4 to show help menu"<<endl;
    cout<<"Enter 0 to exit"<<endl;
}

void buyPetrol(Petrol *petrol){
    int litters = 0;
    cout<<"Enter Petrol quantity(in integer): "<<endl;
    cin>>litters;
    Order *tempOrder = new Order(petrol, litters);
    delete tempOrder;
    cout<<"success"<<endl;
    help();
}

int main() {

    int flag = rec();
    if (flag == 1) return 1;

    cout<<"Enter today`s oil price(per 1 barrel): "<<endl;
    cin>>oilPrice;

    oil = new Oil(oilPrice);
    A80 = new Petrol(oil->getPrice(),"A80",2.5);
    A92 = new Petrol(oil->getPrice(),"A92",3);
    A95 = new Petrol(oil->getPrice(),"A95",3.5);

    help();

    while (true){
        int temp = 0;
        cin>>temp;
        switch (temp){
            case 1:
                buyPetrol(A80);
                break;
            case 2:
                buyPetrol(A92);
                break;
            case 3:
                buyPetrol(A95);
                break;
            case 4:
                help();
                break;
            case 0:
                return 200;
            default:
                cout<<"Unknown command"<<endl;
                help();
                break;
        }
    }
}
