package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;

public class TDA {

    public static void main(String[] args) {
        Lista listita = new Lista();

        int opcion = 0, elemento;
        boolean eliminado = false;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo a la lista circular\n"
                        + "2. Eliminar nodo de la lista circular\n"
                        + "3. Mostrar los datos de la lista circular\n"
                        + "4. Salir.\n"
                        + "Eliga una opcion",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo", "Agregando nodo a la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if (!listita.EstaVacia()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento del nodo a eliminar", "Nodo eliminado",
                                    JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listita.Eliminar(elemento);
                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento);
                            } else {
                                JOptionPane.showMessageDialog(null, "El elemento no esta en la lista");
                            }
                        }else{
                         JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        }
                        break;
                    case 3:
                        if (!listita.EstaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Ha finalizado el programa");
                        break;

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
            }
        } while (opcion != 4);

    }
}
