public class Main {
    public static void main(String[] args) {

        Mamiferos mamifero1 = new Mamiferos("Mamiferos", "Varios", "Diverso");
        Mamiferos mamifero2=new Mamiferos("Multiple");

        Elefante elefante1 = new Elefante("Paquidermos","Selva","Mamifero herbivoro" );
        Elefante elefante2=new Elefante("Grande");


        Caballo caballo1=new Caballo("Equinos","Bosques","Mamifero herbivoro");
        Caballo caballo2=new Caballo("Pequeño");

        mamifero1.imprimirSaludo();
        mamifero2.imprimirSaludo("Varios");

        elefante1.imprimirSaludo();
        elefante2.imprimirSaludo("Trompeteo");

        caballo1.imprimirSaludo();
        caballo2.imprimirSaludo(" Relinchar");


    }
}