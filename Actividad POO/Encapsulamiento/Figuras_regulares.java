public class Figuras_regulares
{
    // Definir una lista de algunas figuras elementales
    String [] Figuras_basicas={"Triangulo","Cuadrado","Rectangulo"};
    //Atributos (encapsulados [privados])
    private double ancho;
    private double alto;
    private int num_lados;
    private double perimetro;
    private double area;
    private String Nombre_figura;

    //Constructores
    public Figuras_regulares(double base, double altura) //Para rectangulos
    {
        this.ancho = base;
        this.alto= altura;
        this.num_lados=4;
        this.Nombre_figura="Rectangulo";
    }

    public Figuras_regulares(double lado) // Para cuadrados
    { 
        //Esta linea
        this(lado,lado);
        /*Omite todo esto:
        this.ancho=lado;
        this.alto=lado;*/
        this.num_lados=4;
        this.Nombre_figura="Cuadrado";
    }

    public Figuras_regulares(double lado, String Nombre, int num_lados) // Para cualquier otra figura regular
    {
        this(lado, lado);
        this.Nombre_figura=Nombre;
        this.num_lados=num_lados;
    }

    //Metodos Getters
    public double getAncho(){return this.ancho;}
    public double getAlto(){return this.alto;}

    //Metodo Calcular Perimetro (encapsulado)
    private void CalcularPerimetro()
    {
        // Verificar de que figura se desea obtener el perimetro (cudrado, rectangulo, pentagono, etc)
        if (this.Nombre_figura.equals("Cuadrado") || this.Nombre_figura.equals("Rectangulo"))
        {
            this.perimetro = (2* (this.ancho + this.alto));
        }
        else
        {
            this.perimetro = (this.num_lados * ancho);
        }
    }   
    
    //Metodo Calcular Area (encapsulado)
    private void CalcularArea()
    {
        // Verificar de que figura se desea obtener el area (cudrado, rectangulo, pentagono, etc)
        boolean figura_especial=true;
        // Comprobar si el nombre de la figura esta en el arreglo de figuras estandar (calculos simples)
        for (int i=0; i<Figuras_basicas.length; i++)
        {
            if (Figuras_basicas[i].equals(this.Nombre_figura))
            {
                figura_especial=false;
            }
        }

        if (!figura_especial) // Si la figura es de 4 lados o menos (triangulo, rectangulo o cuadrado)
        {
            if (this.Nombre_figura.equals("Triangulo"))
            {
                double altura=Math.sqrt(Math.pow(this.alto, 2)-Math.pow(this.ancho/2, 2));
                this.area=(ancho*altura)/2;
            }
            else
            {
                this.area=(ancho * alto);
            }
        }
        else //Si la figura es de mas de 4 lados (Calculos extra para el area)
        {
            double angulo_central=360/this.num_lados;
            double radianes=Math.toRadians(angulo_central/2);
            double apotema=this.alto/(2*Math.tan(radianes));
            this.area=(this.perimetro*apotema)/2;
        }
    }
    //metodo para obtener toda la informacion de la figura
    public String Info()
    {
        // Comprobar si las variables perimetro y area tienen asignado un valor
        if (this.perimetro == 0 || this.area == 0) {
            CalcularPerimetro();
            CalcularArea();
        }
        return String.format("El %s de lados %.3f m, %.3f m\nTiene un perimetro de %.3f m y area de %.3f m^2\n",
                this.Nombre_figura, this.getAncho(), this.getAlto(), this.perimetro, this.area);
    }
}