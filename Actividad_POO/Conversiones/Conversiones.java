public class Conversiones {
    public static void main(String[] args) {
        // Definir variables iniciales
        int entero = 15;
        double decimal = 12.34;

        //Convertir entero a decimal
        double num_decimal=(double)entero;
        System.out.println("Conversion de enteros a decimales");
        System.out.println("El valor del entero es: " + entero);
        System.out.println("La conversion a decimal es: " + num_decimal);

        // Convertir decimal a entero
        int num_entero=(int)decimal;
        System.out.println("\n\nConversion de decimales a enteros");
        System.out.println("El valor del decimal es: "+decimal);
        System.out.println("La conversion a entero es: " +num_entero);

        // Convertir de entero a byte
        System.out.println("\n\nConversion de Entero a Byte");
        int num_int=34;
        byte binario=(byte)num_int;
        System.out.println("El valor del entero es: "+num_int);
        System.out.println("La conversion a byte es: "+binario);

        // Convertir de byte a entero
        System.out.println("\n\nConversion de Byte a Entero");
        byte nroByte=60;
        System.out.println("Número en Byte: "+nroByte);
        int nroEntero= (int)nroByte;
        System.out.println("Número en Entero: "+nroEntero);

        // Convertir de char a int
        char letra='D';
        int numero_car= (int)letra;
        System.out.println("\n\nConverción de Char a Int");
        System.out.println("Carácter: "+letra);
        System.out.println("Número correspondiente al Carácter: "+numero_car);

        // Convertir de cadena a entero
        String frase="18";
        int numCadena=Integer.parseInt(frase);
        System.out.println("\n\nConversión de String a Int");
        System.out.println("Cadena: "+frase);
        System.out.println("Número correspondiente al Carácter: "+numCadena);
        System.out.println("Sumar el valor entero + 3: "+(numCadena+3));
    }
    
}
