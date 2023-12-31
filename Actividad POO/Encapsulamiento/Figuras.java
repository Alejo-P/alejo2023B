public class Figuras {
    // Definir una lista de algunas figuras elementales
    String [] Figuras_basicas={"Triangulo","Cuadrado","Rectangulo"};
    //Atributos
    private float ancho;
    private float alto;
    private int num_lados;
    private float perimetro;
    private double area;
    private String Nombre_figura;
    //Constructores
    public Figuras(float base, float altura)
    {
        this.ancho = base;
        this.alto= altura;
        this.num_lados=4;
        this.Nombre_figura="Rectangulo";
    }
    public Figuras(float lado)
    { 
        //Esta linea
        this(lado,lado);
        this.num_lados=4;
        /*Omite todo esto:
        this.ancho=lado;
        this.alto=lado;*/
        this.Nombre_figura="Cuadrado";
    }
    public Figuras(float lado, String Nombre, int num_lados)
    {
        this(lado, lado);
        this.Nombre_figura=Nombre;
        this.num_lados=num_lados;
    }
    //Metodos
    public float getAncho(){return this.ancho;}
    public float getAlto(){return this.alto;}
    //Metodo Calcular Perimetro
    public void CalcularPerimetro()
    {
        if (this.Nombre_figura.equals("Cuadrado") || this.Nombre_figura.equals("Rectangulo"))
        {
            this.perimetro = (2* (this.ancho + this.alto));
        }
        else
        {
            this.perimetro = (this.num_lados * (ancho));
        }
    }   
    
    //Metodo Calcular Area
    public void CalcularArea()
    {
        boolean figura_especial=true;
        for (int i=0; i<Figuras_basicas.length; i++)
        {
            if (Figuras_basicas[i].equals(this.Nombre_figura))
            {
                figura_especial=false;
            }
        }
        if (!figura_especial)
        {
            if (this.Nombre_figura.equals("Triangulo"))
            {
                this.area=(ancho*alto)/2;
            }
            else
            {
                this.area=(ancho * alto);
            }
        }
        else
        {
            double angulo_central=(360)/this.num_lados;
            double apotema=this.alto/(2*Math.tan(angulo_central/2));
            this.area=(this.area*apotema*this.num_lados)/2;
        }
    }
    //metodo para obtener toda la informacion de la figura
    public String Info()
    {
        //Comprobar si las variables perimetro y area tienen asignado un valor
        if (this.perimetro==0 || this.area==0)
        {
            CalcularPerimetro();
            CalcularArea();
        }
        return "La "+this.Nombre_figura+" mide Ancho: "+this.getAncho()+", Alto:"+this.getAlto()+".\nSu Perimetro es:"+this.perimetro+", y su Area es:"+this.area;
    }
}
