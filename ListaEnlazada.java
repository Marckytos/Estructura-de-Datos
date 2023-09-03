package Listas;

public class ListaEnlazada {
    Nodo cabeza;
    int size;

    public ListaEnlazada() {
        cabeza = null;
        size=0;
    }
    public Object obtener(int index){
        int contador=0;
        Nodo temporal=cabeza;
        while(contador<index){
            temporal=temporal.ObtenerSiguiente();
            contador++;
        }
        return temporal.ObtenerValor();
    }

    public void addPrimero(Object obj) {

        if(cabeza== null){
            cabeza=new Nodo(obj);
        }else{
            Nodo temp=cabeza;
            Nodo nuevo=new Nodo(obj);
            nuevo.Enlazarsiguiente(temp);
            cabeza=nuevo;
        }
        size++;

    }
    public void cortar(int index){
        int contador = 0;
        Nodo temporal=cabeza;
        while(contador < index -1){
            temporal=temporal.ObtenerSiguiente();
            contador++;
        }
        temporal.Enlazarsiguiente(null);
        size=index;
    }

    public void eliminar(int index){
        if(index==0){
            cabeza=cabeza.ObtenerSiguiente();
        }else{
            int contador=0;
            Nodo temporal=cabeza;
            while(contador < index -1){
                temporal=temporal.ObtenerSiguiente();
                contador++;
            }
            temporal.Enlazarsiguiente(temporal.ObtenerSiguiente().ObtenerSiguiente());
        }
        size--;


    }
    public int size(){
        return size;
    }


        public boolean estaVacia () {
            return (cabeza == null)?true:false;
        }
    }

