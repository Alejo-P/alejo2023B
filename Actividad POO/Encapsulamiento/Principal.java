public class Principal
{
    public static void main(String[] args)
    {
        // Declarar variables y asignarles valores
        Figuras_regulares cuadrado=new Figuras_regulares(15);
        Figuras_regulares triangulo= new Figuras_regulares(7.3, "Triangulo", 3);
        Figuras_regulares pentagono=new Figuras_regulares(4.5, "Pentagono", 5);
        Figuras_regulares rectangulo= new Figuras_regulares(7.9, 9);
        System.out.println("Cuadrado:");
        System.out.println(cuadrado.Info());

        System.out.println("Triangulo:");
        System.out.println(triangulo.Info());

        System.out.println("Rectangulo:");
        System.out.println(rectangulo.Info());

        System.out.println("Pentagono");
        System.out.println(pentagono.Info());
    }
}