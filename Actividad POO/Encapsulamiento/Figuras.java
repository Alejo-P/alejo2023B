public class Figuras {
    //Atributos
    private float ancho;
    private float alto;
    private float perimetro;
    private float area;
    private String Nombre_figura;
    //Constructores
    public Figuras(float base, float altura)
    {
        this.ancho = base;
        this.alto= altura;
        this.Nombre_figura="Rectangulo";
    }
    public Figuras(float lado)
    { 
        //Esta linea
        this(lado,lado);
        /*Omite todo esto:
        this.ancho=lado;
        this.alto=lado;*/
        this.Nombre_figura="Cuadrado";
    }
    public Figuras(float lado, String Nombre)
    {
        this(lado, lado);
        this.Nombre_figura=Nombre;
    }
    //Metodos
    public float getAncho(){return this.ancho;}
    public float getAlto(){return this.alto;}
    //Metodo Calcular Perimetro
    public void CalcularPerimetro()
    {
        this.perimetro = (2 * (ancho + alto));
    }
    //Metodo Calcular Area
    public void CalcularArea()
    {
        this.area = (ancho * alto);
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
        return "La "+this.Nombre_figura+" mide Ancho: "+this.getAncho()+", Alto:"+this.getAlto()+".\nSu Perimetro es:"+this.perimetro+", y su Areaes:"+this.area;
    }
}
