package Listas.ListaCircular;


public class NodoCircular {
    private Estudiante dato;
    private NodoCircular siguiente;

    public NodoCircular(Estudiante dato, NodoCircular siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
}