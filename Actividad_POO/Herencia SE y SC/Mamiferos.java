//CLASE PADRE
public class Mamiferos {
    String nombre;
    String habitat;
    String clasificacion;
    String tamaño;

    //CONSTRUCTOR
    public Mamiferos(String nombre, String habitat, String clasificacion){
        this.nombre=nombre;
        this.habitat=habitat;
        this.clasificacion=clasificacion;
    }

    //SOBRECARGA DE CONSTRUCTOR
    public Mamiferos(String tamaño) {
        this.tamaño= tamaño;
    }

    //DECLARACION DEL METODO ABSTRACTO EN LA CLASE PADRE
    public void imprimirSaludo() {System.out.println("Hola soy la clase Padre");}

    //SOBRECARGA DE METODO
    public void imprimirSaludo(String tipo_sonido){
        System.out.printf("Soy la clase de la cual se heredan atributos y métodos otras clases denominadas: \"clases hijas\" o \"subclases\".");
        System.out.println();
    }


}
