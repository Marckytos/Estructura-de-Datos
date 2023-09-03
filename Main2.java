package Listas.ListaCircular;

public class Main2 {
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();
        String programas[]={"sistemas","biologia","derecho","Fsisco-matematico","español"};

        for (int i = 0; i <10 ; i++) {
            listaCircular.insertarOrdenado(new Estudiante("E"+i, programas[(int)(Math.random()* programas.length)]
                    ,(int)(Math.random()*(50+1-17))+17, (float)(Math.random()*5.1) ));


        }
        System.out.println(listaCircular.mostrar());

        listaCircular.eliminarInicio();
        listaCircular.eliminarFinal();

        System.out.println(listaCircular.mostrar());

    }
}
