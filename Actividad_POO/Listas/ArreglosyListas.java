public class ArreglosyListas
{
    public static void main(String[] args)
    {
        //Arreglo
        int [] arreglo = new int[5];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i=0;i<arreglo.length;i++)
        {
            arreglo[i] = Integer.parseInt(System.console().readLine());
        }
        //Imprimir el arreglo
        System.out.println("\nContenido del arreglo: ");
        for (int j : arreglo)
        {
            System.out.print(j + " ");
        }
        
    }
    
}
