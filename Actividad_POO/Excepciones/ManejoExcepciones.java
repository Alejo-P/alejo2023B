import java.util.Scanner;
public class ManejoExcepciones
{
    public static void main(String[] args)
    {
        //Manejo de escepciones (bloque try-catch)
        Scanner sc = new Scanner(System.in);
        int errores=0;
        System.out.println("Vamos a convertir una cadena de caracteres a un numero");
        System.out.print("Ingrese un valor >");
        String cad=sc.nextLine();
        try
        {
            double numero=Double.parseDouble(cad); //Se lanza la excepcion si no se puede realizar el parseo
            System.out.printf("El numero ingresado fue: %.2f\n",numero);
        }
        catch(NumberFormatException e)//Catch para atrapar la excepcion NumberFormatException que se produce cuando no se puede converir la cadena a numero
        {
            errores+=1;
            System.out.println("Ha ocurrido una excepcion.\nDetalles:\n"+e);
        }
        finally
        {
            System.out.printf("El programa finalizo su ejecucion con %d error/es", errores);
        }
        sc.close();
    }
}
    
       
    
