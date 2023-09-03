package Listas;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(836348);
        Nodo tercero = new Nodo("Ojalá funcione");

        primer.Enlazarsiguiente(segundo);
        primer.ObtenerSiguiente().Enlazarsiguiente(tercero);

        System.out.println(primer.ObtenerSiguiente().ObtenerSiguiente().ObtenerValor().toString());
        System.out.println("-------------------lista enlazada-----------------------");


        ListaEnlazada lista = new ListaEnlazada();

        lista.addPrimero("Marckytos");
        lista.addPrimero(20);
        lista.addPrimero("UNAM");
        lista.addPrimero(64387248);
        lista.addPrimero("ICO FES ARAGON");
        lista.addPrimero("Ejemplo lista enlazada");

        //lista.eliminar(2);
        //lista.cortar(3);

        System.out.println("Primer elemento: " + lista.obtener(0));
        System.out.println("Ultimo elemento:   " + lista.obtener(lista.size()-1));
        System.out.println("Index 2: " + lista.obtener(2));

        System.out.println("Esta vacia: " + lista.estaVacia());
        System.out.println("Tamaño de lista: " + lista.size());


        System.out.println("-------------Ejemplo lista doble------------------");

        ListaDoble listaDoble = new ListaDoble();
        int opcion=0,elemento;

        do{
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo al inicio\n"
                        +"2. Agregar un nodo al final\n"
                        +"3. Mostrar la lista de inicio a fin\n"
                        +"4. Mostrar la lista de fin a inicio\n"
                        +"5. Eliminar un nodo del inicio\n"
                        +"6. Eliminar un nodo del final\n"
                        +"7. Salir\n"
                        +"¿Que deseas hacer?", "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento"
                        ,"Agregar al inicio",JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.AgregarInicio(elemento);
                        break;
                    case 2:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento"
                                ,"Agregar al final",JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.AgregarFinal(elemento);
                        break;
                    case 3:
                        if(!listaDoble.estaVacia()){
                            listaDoble.MostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null,"Aun no hay nodos"
                            ,"Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listaDoble.estaVacia()){
                            listaDoble.MostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"Aun no hay nodos"
                                    ,"Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!listaDoble.estaVacia()){
                            elemento=listaDoble.EliminardelInicio();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es"
                                    +elemento,"Eliminación del inicio exitosa",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Aun no hay nodos"
                                    ,"Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!listaDoble.estaVacia()){
                            elemento=listaDoble.EliminardelFinal();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es"
                                    +elemento,"Eliminación del final exitosa",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Aun no hay nodos"
                                    ,"Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Finalizado"
                                ,"Hecho",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion desconocida"
                        ,"Error 404",JOptionPane.ERROR_MESSAGE);
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error" + n.getMessage());
            }

        }while (opcion!=7);




    }
}
