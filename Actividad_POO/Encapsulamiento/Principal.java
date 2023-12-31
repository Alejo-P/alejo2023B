public class Principal
{
    public static void main(String[] args)
    {
        //Crear objetos a partir de la clase Figuras_regulares
        Figuras_regulares cuadrado=new Figuras_regulares(15);
        Figuras_regulares triangulo= new Figuras_regulares(7.3, "Triangulo", 3);
        Figuras_regulares pentagono=new Figuras_regulares(4.5, "Pentagono", 5);
        Figuras_regulares rectangulo= new Figuras_regulares(7.9, 9);
        //Usar los metodos accesibles del objeto definido a partir de la clase Figuras_regulares
        System.out.println("Cuadrado:");
        System.out.printf("Alto de la figura: %.2f, Ancho de la figura: %.2f\n",cuadrado.getAlto(), cuadrado.getAncho());
        System.out.println(cuadrado.Info());

        System.out.println("Triangulo:");
        System.out.printf("Alto de la figura: %.2f, Ancho de la figura: %.2f\n",triangulo.getAlto(), triangulo.getAncho());
        System.out.println(triangulo.Info());

        System.out.println("Rectangulo:");
        System.out.printf("Alto de la figura: %.2f, Ancho de la figura: %.2f\n",rectangulo.getAlto(), rectangulo.getAncho());
        System.out.println(rectangulo.Info());

        System.out.println("Pentagono");
        System.out.printf("Alto de la figura: %.2f, Ancho de la figura: %.2f\n",pentagono.getAlto(), pentagono.getAncho());
        System.out.println(pentagono.Info());
    }
}