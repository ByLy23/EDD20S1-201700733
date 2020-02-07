#include <iostream>
#include "ListaSimple.h"
using namespace std;

int main()
{
    int carne;
    string nombre;
    ListaSimple *lista= new ListaSimple();
cout<<"*****************Ingresando datos*************"<<endl;
lista->insertar(201700733,"ByLy23");
lista->insertar(2012,"Juan");
lista->insertar(20,"mia");
lista->imprimir();
cout<<"***************Buscando datos******************"<<endl;
lista->buscar(201700733);
cout<<"*****************Eliminando*********************"<<endl;
lista->eliminar(lista->buscar(2012));
lista->imprimir();
