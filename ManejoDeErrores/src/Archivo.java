import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Archivo {

    //Sin manejo de Excepciones
    /*/public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // Esto producirá una excepción ArithmeticException
        System.out.println("Resultado: " + result);
    }/*/

    //Con Manejo de Excepciones
    /*/public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Resultado" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } finally {
            System.out.println("Bloque finally ejecutado. ");
        }

        //try: Encierra el código que puede lanzar una excepción.
        //catch: Captura y maneja la ArithmeticException.
        //finally: Este bloque siempre se ejecuta, independientemente de si se lanzó una excepción o no.
        //ArithmeticException: Esta es la clase de excepción real en Java que representa errores relacionados con operaciones aritméticas.
        //e: Este es un nombre de variable declarado por el programador. Por convención, los programadores suelen utilizar letras individuales como "e" o "ex" para almacenar objetos de excepción. Es simplemente una forma de referirse a la excepción específica que se lanzó.
    }/*/

    public static void leerArchivo(String ruta) throws IOException {
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        while ((linea = br.readLine()) !=null) {
            System.out.println(linea);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }

}