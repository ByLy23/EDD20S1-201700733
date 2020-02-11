#include <iostream>
#include "ListaDoble.h"

using namespace std;

ListaDoble<char> *ListaChars= new ListaDoble<char>();
void recorrerLista(){
for(int i=0; i<ListaChars->getSize();i++){
    cout<<"mostrar: "<<ListaChars->obtener_at(i)<<endl;
}
}
int main()
{
cout<<"***********Ingresando datos***********"<<endl;
ListaChars->agregar_inicio('c');
ListaChars->agregar_inicio('a');
ListaChars->agregar_inicio('b');
ListaChars->agregar_inicio('s');
ListaChars->agregar_inicio('d');
ListaChars->agregar_inicio('f');
recorrerLista();
cout<<"**********Eliminando datos***********"<<endl;
cout<<"Eliminando: "<<ListaChars->eliminar(ListaChars->getSize())<<endl;
cout<<"Eliminando: "<<ListaChars->eliminar(ListaChars->getSize())<<endl;
recorrerLista();
cout<<"************buscar Datos************"<<"\n"<<"Ingrese una palabra"<<endl;
string palabra;
cin>>palabra;
char letra= palabra[0];
for(int i=0; i<ListaChars->getSize();i++){
    if(ListaChars->obtener_at(i)==letra){
        cout<<"La palabra es: "<<palabra<<" y la letra que se encontro es: "<<letra<<endl;
    }
}

}
