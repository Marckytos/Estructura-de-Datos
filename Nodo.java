package Listas;

public class Nodo {
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor=valor;
        this.siguiente=null;

    }
    public Object ObtenerValor(){
        return valor;
    }
    public void Enlazarsiguiente(Nodo n){
        siguiente = n;
    }
    public Nodo ObtenerSiguiente(){
        return siguiente;
    }
}
