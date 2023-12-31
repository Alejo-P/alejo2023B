public class Principal
{
    public static void main(String[] args)
    {
        // Declarar variables y asignarles valores
        Figuras_regulares cuadrado=new Figuras_regulares(15);
        Figuras_regulares triangulo= new Figuras_regulares(7.3, "Triangulo", 3);
        Figuras_regulares rectangulo= new Figuras_regulares(7.9, 9);
        System.out.println("Cuadrado:");
        cuadrado.Info();
        System.out.println("Triangulo:");
        triangulo.Info();
        System.out.println("Rectangulo:");
        rectangulo.Info();
    }
}