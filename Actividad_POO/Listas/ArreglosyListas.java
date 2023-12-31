import java.util.ArrayList; //Biblioteca para listas
public class ArreglosyListas
{
    public static void main(String[] args)
    {
        //Arreglo (no inicializado) con tamaño fijo
        int [] arreglo = new int[5];
        //Arreglo (inicializado) con tamaño fijo
        String [] Nombres = {"Juan", "Jose", "Luis", "Marco", "Alberto"};

        //Insertar valores a un arreglo (Acceder al elemento y asignarle un valor)
        System.out.println("Ingrese los valores del arreglo:");
        for (int i=0;i<arreglo.length;i++)
        {
            //Leer el valor por consola
            arreglo[i] = Integer.parseInt(System.console().readLine());
        }

        //Imprimir los valores de los dos arreglos
        System.out.print("\nContenido del arreglo de enteros:\nValores: ");
        for (int j : arreglo) //Recorrer el arreglo (usando for-each)
        {
            System.out.print(j + " ");
        }

        System.out.println(); //Imprimir un salto de linea antes de la siguiente impresion

        System.out.println("\nContenido del arreglo de Strings: ");
        for (String nombre : Nombres) //Recorrer el arreglo (usando for-each)
        {
            System.out.println("Nombre: "+nombre);
        }

        ArrayList <Double> Numeros = new ArrayList<>();//Crear una lista de Enteros (Sin especificar el tamaño de la lista)

        //Agregar valores a la lista (agrega valores al final de la lista)
        Numeros.add(6.5);
        Numeros.add(4.0);

        //Obtener el tamaño de la lista
        System.out.printf("\nTamaño de la lista de numeros: %d\n", Numeros.size());

        //Mostrar todos los elementos de la lista
        System.out.println("Elementos de la lista de numeros:");
        for (double num : Numeros)
        {
            System.out.printf("%.2f ",num);
        }

        //Eliminar un valor de la lista
        Numeros.remove(4.0); //Quita el numero 4.0 de la lista (La primera aparicion del elemento)

        //Modificar el valor de un elemento de la lista
        Numeros.set(0,3.7); //Reemplaza el valor 3.7 en la posicion 0

        //Obtener el tamaño de la lista
        System.out.printf("\nNuevo tamaño de la lista de numeros: %d\n", Numeros.size());

        //Imprimir los nuevos valores de la lista
        System.out.println("Elementos de la lista de numeros (modificada):");
        for (double num : Numeros)
        {
            System.out.printf("%.2f ",num);
        }
    }
}
