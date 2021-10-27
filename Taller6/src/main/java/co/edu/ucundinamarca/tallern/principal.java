package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

public class principal {

    String nombre;
    int cedula;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        nodo lista = null;
        nodo lista2 = null;
        int opcion; // opcion del menu
        int op1;
        int dato; // elemenento a ingresar
        String nombre;
        menu1();
       
        do {
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    System.out.print(" INGRESE CEDULA:\n ");
                    dato = teclado.nextInt();
                    System.out.print(" INGRESE NOMBRE: \n");
                    nombre = teclado.nextLine();
                    insertarFinal(lista, lista2, dato, nombre);
                    break;

                case 2:

                    System.out.print("1. BUSCAR\n");
                    System.out.print("2. ELIMINAR\n");
                    System.out.print("3. MODIFICAR\n");
                    op1 = teclado.nextInt();
                    if (op1 == 1) {
                        System.out.print("\n CEDULA A BUSCAR: ");
                        dato = teclado.nextInt();
                        buscarElemento(lista, lista2, dato);
                    } else if (op1 == 2) {
                        System.out.print("\n INGRESE CEDULA PARA ELIMINAR DATOS: ");
                        dato = teclado.nextInt();
                        eliminarElemento(lista, lista2, dato);
                    } else if (op1 == 3) {
                        System.out.print("\n CEDULA QUE DESEA MODIFICAR: ");
                        dato = teclado.nextInt();
                        modificarElemento(lista, lista2, dato);
                    }
                    break;

                case 3:

                    System.out.print("\n MOSTRANDO LISTA:\n ");
                    reportarLista(lista, lista2);
                    break;

                case 4:
                    System.out.println("HA SALIDO");
                    break;
            }

        } while (opcion != 4);
    }

    public static void buscarElemento(nodo lista, nodo lista2, int valor) {
        nodo q = lista;
        nodo p = lista2;
        int i = 1;
        int band = 0;

        while (q != null) {
            if (q.numero == valor) {
                //si esta
                System.out.print("\nLA CEDULA \n");
                System.out.print(valor);
                System.out.print("\nESTA REGISTRADA A NOMBRE DE \n");
                System.out.print(lista2.nombre);

                band = 1;
            }
            q = q.sgte;
            p = p.sgte;

            i++;
        }

        if (band == 0) {
            System.out.print("\nNO SE ENCONTRO LA CEDULA \n");
            System.out.print(valor);
        }
        //no esta
    }

    public static void modificarElemento(nodo lista, nodo lista2, int valor) {
        Scanner teclado = new Scanner(System.in);
        nodo q = lista;
        nodo p = lista2;

        int i = 1;
        int band = 0;

        while (q != null) {
            if (q.numero == valor) {
                String aux = "";
                //si esta
                System.out.print("LA CEDULA ");
                System.out.print(valor);
                System.out.print(" ESTA REGISTRADA A NOMBRE DE ");
                System.out.print(lista2.nombre);
                System.out.print("\n");
                System.out.print("INGRESE NUEVO NOMBRE: \n");
                aux = teclado.nextLine();
                lista2.nombre = aux;
                band = 1;
            }
            q = q.sgte;
            p = p.sgte;

            i++;
        }

        if (band == 0) {
            System.out.print("\n NO SE ENCONTRO LA CEDULA \n");
            System.out.print(valor);
        }

        //no esta
    }

    public static void insertarFinal(nodo lista, nodo lista2, int valor, String nombre) {

        nodo t, q = new nodo();
        nodo i, o = new nodo();
        nodo f = lista;
        int e = 1;
        int band = 0;

        while (f != null) {
            if (f.numero == valor) {
                //si esta
                System.out.print(" LA CEDULA ");
                System.out.print(valor);
                System.out.print(" YA FUE REGISTRADA PREVIAMENTE");
                band = 1;
            }
            f = f.sgte;
            e++;
        }
        if (band == 0) {
            q.numero = valor;
            q.sgte = null;
            if (lista == null) {
                lista = q;
            } else {
                t = lista;
                while (t.sgte != null) {
                    t = t.sgte;
                }
                t.sgte = q;
            }
            o.nombre = nombre;
            o.sgte = null;

            if (lista2 == null) {
                lista2 = o;
            } else {
                i = lista2;
                while (i.sgte != null) {
                    i = i.sgte;
                }
                i.sgte = o;
            }
        }
    }

    public static void reportarLista(nodo lista, nodo lista2) {
        int i = 0;

        while (lista != null) {
            System.out.print("( " + i + 1 + ")" + lista.numero + "=" + lista2.nombre);
            lista = lista.sgte;
            lista2 = lista2.sgte;
            i++;
        }
    }

    public static void eliminarElemento(nodo lista, nodo lista2, int valor) {
        nodo p;
        nodo ant;
        nodo q;
        nodo ant2;
        p = lista;
        q = lista2;
        ant = null;
        ant2 = null;

        if (lista != null) {
            while (p != null) {
                if (p.numero == valor) {
                    if (p == lista) {
                        lista = lista.sgte;
                        lista2 = lista2.sgte;
                    } else {

                        ant.sgte = p.sgte;
                        ant2.sgte = q.sgte;
                    }

                    return;
                }
                ant = p;
                p = p.sgte;
                ant2 = q;
                q = q.sgte;
            }
        } else {
            System.out.print(" LISTA VACIA..!");
        }
    }

    public static void menu1() {
        System.out.print("----LISTA ENLAZADA SIMPLE----\n");
        System.out.print(" 1. REGISTRAR      \n");
        System.out.print(" 2. ACTUALIZAR     \n");
        System.out.print(" 3. MOSTRAR LISTA  \n");
        System.out.print(" 4. SALIR          \n");

    }

    static class nodo {

        public int numero;
        public String nombre;
        public nodo sgte;

    }

}
