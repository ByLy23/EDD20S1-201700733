#ifndef LISTASIMPLE_H
#define LISTASIMPLE_H
#include <iostream>
using namespace std;
class Nodo{
        Nodo *siguiente;
        int carnet;
        string nombre;
    public:
        Nodo(int carnet, string nombre){
            siguiente=0;
            this->nombre=nombre;
            this->carnet=carnet;
        }
        void setSiguiente(Nodo *nuevo){
            siguiente= nuevo;
        }
        Nodo *getSiguiente(){
            return siguiente;
        }
        void setNombre(string nombre)
        {
            nombre= nombre;
        }
        void setCarnet(int carnet)
        {
            carnet= carnet;
        }
        string getNombre(){
            return nombre;
        }
        int getCarnet(){
            return carnet;
        }
    };
class ListaSimple{

    Nodo *inicio;
    Nodo *fin;
    int tamanio;
    bool estaVacia();
    public:
        ListaSimple(){
            inicio=0;
            tamanio=0;
        }
        int getTamanio(){
        return tamanio;
        }
        void insertar(int, string);
        void eliminar(Nodo *nuevo);
        Nodo *buscar(int);
        void imprimir();
};
bool ListaSimple::estaVacia()
{
    return this->tamanio==0;
}
void ListaSimple::imprimir(){
    Nodo *aux=this->inicio;

    while(aux!=0)
    {
        cout<<"Alumno: "<<aux->getNombre()<<" Carnet: "<<aux->getCarnet()<<endl;
        aux=aux->getSiguiente();
    }
}
void ListaSimple::insertar(int carnet, string nombre)
{
    Nodo *nuevo= new Nodo(carnet, nombre);
    if(estaVacia()){
        this->inicio=nuevo;
        tamanio++;
    }
    else
    {
        nuevo->setSiguiente(this->inicio);
        this->inicio=nuevo;
        tamanio++;
    }
}
void ListaSimple::eliminar(Nodo *nuvo)
{
    nuvo=this->inicio;
    nuvo->setSiguiente(0);
}
Nodo* ListaSimple::buscar(int carne){
    Nodo *aux=this->inicio;
    bool bandera=false;
    while(aux!=0)
    {
        if(aux->getCarnet()==carne)
        {
            bandera=true;
            break;
        }
        aux= aux->getSiguiente();
    }
    if(bandera){
        cout<<"El alumno: "<<aux->getNombre()<<" Que se identifica con el numero de Carnet: "<<aux->getCarnet()<<" Pertenece al listado"<<endl;
    }
    else{
        cout<<"No se pudo encontrar al alumno"<<endl;
    }
    return aux;
}

#endif // LISTASIMPLE_H
