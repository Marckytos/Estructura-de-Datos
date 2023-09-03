package Listas;

public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;


    //Constructor cuando no hay nodos
    public NodoDoble(int el){
        this(el,null,null);

    }
    //Constructor cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a) {
        dato = el;
        siguiente = s;
        anterior = a;
    }


}

