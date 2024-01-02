
public class Caballo extends Mamiferos{

    //CONSTRUCTOR
    public Caballo (String nombre, String habitat, String clasificacion){super(nombre, habitat, clasificacion);}

    //SOBRECARGA DE CONSTRUCTOR
    public Caballo(String tamaño) {
        super(tamaño);
    }

    //SOBREESCRITURA DE METODO
    @Override
    public void imprimirSaludo() {
        //super.imprimirSaludo();
        System.out.println();
        System.out.printf("Hola soy la clase: \"Caballo\"y puedo acceder a los atributos y metodos de la Clase Padre");
        System.out.println();
    }
    //SOBRECARGA DE METODO

    public void imprimirSaludo(String tipo_sonido){
        System.out.println("El sonido que hago es: "+tipo_sonido+".");

    }
}
