import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Correccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String error;
        List<String> Canciones = new ArrayList<>();

        do {
            System.out.print("Ingrese el género de la canción >");
            String GeneroCancion = sc.nextLine();
            Cancion cancion = new Cancion(GeneroCancion);

            do {
                try {
                    System.out.print("\nIngrese su valoración >");
                    int ValoracionUsuario = Integer.parseInt(sc.nextLine());
                    cancion.setValoracion(ValoracionUsuario);
                    error = "";
                } catch (NumberFormatException e) {
                    error = e.getMessage();
                    System.err.println("Error: Sólo se permiten valores numéricos para la valoración.");
                }
            } while (error.length() != 0);

            System.out.print("\nIngrese el título de la canción >");
            String TituloCancion = sc.nextLine();
            cancion.setTitulo(TituloCancion);

            System.out.print("\nIngrese el autor de la canción >");
            String AutorCancion = sc.nextLine();
            cancion.setAutor(AutorCancion);

            // Agregar a la lista de canciones
            Canciones.add(cancion.toString());

            System.out.print("\n¿Desea ingresar otra canción? (Sí/No) >");
        } while (sc.nextLine().equalsIgnoreCase("Sí"));

        // Mostrar la información de todas las canciones ingresadas
        System.out.println("\nMostrando la información de todas las canciones:");
        for (int i = 0; i < Canciones.size(); i++) {
            System.out.println((i + 1) + "-" + Canciones.get(i));
        }

        sc.close();
    }
}
