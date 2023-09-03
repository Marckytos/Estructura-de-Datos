package Listas.ListaCircular;



public class ListaCircular {
    private NodoCircular inicio;
    private NodoCircular fin;
    private int cantidad;

    public ListaCircular() {

        this.inicio=null;
        this.fin=null;
        this.cantidad=0;


    }
    public boolean vacia(){
        return inicio==null && fin==null;

    }
    public void agregarInicio(Estudiante dato){
        if(vacia()) {
            inicio = fin = new NodoCircular(dato, inicio);
        }else{
            inicio=new NodoCircular(dato,inicio);
        }
        fin.setSiguiente(inicio);
        cantidad++;


    }
    public void agregarFinal(Estudiante dato){
        if(vacia()) {
            inicio = fin = new NodoCircular(dato, inicio);
        }else {
            NodoCircular nuevo=new NodoCircular(dato,inicio);
            fin.setSiguiente(nuevo);
            fin=nuevo;

        }
        cantidad++;

    }
    public void insertarOrdenado(Estudiante dato){
        if(!vacia()){
            if(dato.getEdad()<=inicio.getDato().getEdad()){
                agregarInicio(dato);

            }else if(dato.getEdad()>=fin.getDato().getEdad()){
                agregarFinal(dato);
            }else{
                NodoCircular aux=inicio;
                while(dato.getEdad()>=aux.getSiguiente().getDato().getEdad()){
                    aux=aux.getSiguiente();

                }
                NodoCircular nuevo = new NodoCircular(dato, aux.getSiguiente());
                aux.setSiguiente(nuevo);
                cantidad++;
            }
        }else{
            agregarFinal(dato);
        }

    }
    public void eliminarInicio(){
        if(!vacia()){
            if(inicio==fin){
                inicio=fin=null;
            }else{
                inicio=inicio.getSiguiente();
                fin.setSiguiente(inicio);

            }
            cantidad--;

        }
    }public void eliminarFinal(){
        if(!vacia()){
            if(inicio==fin){
                inicio=fin=null;
            }else{
                NodoCircular aux = inicio;
                while(aux.getSiguiente()!=fin){
                    aux=aux.getSiguiente();

                }
                fin=aux;
                fin.setSiguiente(inicio);

            }
            cantidad--;

        }
    }
    public String mostrar(){
        String salida="";
        if(!vacia()){
            NodoCircular aux= inicio;
            do{
                salida+=aux.getDato()+ "\n";
                aux=aux.getSiguiente();

            }while (aux!= inicio);
        }
        return salida;
    }



}
