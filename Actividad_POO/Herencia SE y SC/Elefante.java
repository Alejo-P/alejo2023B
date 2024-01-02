public class Elefante extends Mamiferos{

    //CONSTRUCTOR
    public Elefante(String nombre, String habitat, String clasificacion) {super(nombre, habitat, clasificacion);}

    //SOBRECARGA DE CONSTRUCTOR
    public Elefante(String tamaño){
        super(tamaño);
    }

    //SOBREESCRITURA DE METODO
    @Override
    public void imprimirSaludo() {
        //super.imprimirSaludo();
        System.out.println();
        System.out.printf("Hola soy la clase: \"Elefante\"y puedo acceder a los atributos y metodos de la Clase Padre");
        System.out.println();
    }

    //SOBRECARGA DE METODO

    @Override
    public void imprimirSaludo(String tipo_sonido) {
        System.out.println("El sonido que hago es: "+tipo_sonido+".");
    }
}
