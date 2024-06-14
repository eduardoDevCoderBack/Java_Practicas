import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ImprimirNumeros {
    /*/public static void main(String[] args) {

        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

    }/*/

    /*/public static void main(String[] args) {
        int limite = 20;
        int suma = 0;

        int contador = 2;
        while (contador <= limite) {
            //Suma de los números pares y actualización del contador:
            //suma += contador;: Agrega el valor de contador a suma.
            // Este operador += es una forma abreviada de escribir suma = suma + contador.
            suma += contador;
            //contador += 2;: Incrementa contador en 2. Esto asegura que en la próxima iteración se considere el siguiente número par.
            contador += 2;
        }
        System.out.println("La suma de pares hasta " + limite + " es " + suma);
        //contador += 2;: Incrementa contador en 2. Esto asegura que en la próxima iteración se considere el siguiente número par.
    }/*/

        /*/public static void main(String[] args) {

            //Random, que se utiliza para generar números aleatorios.
            Random random = new Random();
            //int numeroAleatorio = random.nextInt(100) + 1;: Genera un número aleatorio entre 1 y 100. nextInt(100) genera un número entre 0 y 99, por lo que se le suma 1 para obtener un rango de 1 a 100.
            int numeroAleatorio = random.nextInt(100) + 1;

            //Declara una variable para almacenar el número ingresado por el usuario.
            int numeroIngreado = 0;
            //Declara una variable para contar el número de intentos del usuario.
            int intentos = 0;

            //El ciclo continúa ejecutándose mientras el número ingresado no sea igual al número aleatorio y el número de intentos sea menor que 5.
            while (numeroIngreado != numeroAleatorio && intentos <5) {
                System.out.println("Ingrese un número (entre 1 y 100)");
                //Lee el número ingresado por el usuario desde la consola.
                numeroIngreado = new Scanner(System.in).nextInt();
                //intentos++;: Incrementa el contador de intentos.
                intentos++;
            }

            if (numeroIngreado == numeroAleatorio) {
                System.out.println("!Adivinaste!" + numeroAleatorio);
            } else {
                System.out.println("Lo siento, no has acertado. El número era " + numeroAleatorio);
            }
        }/*/

    /*/public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int contador = 0;
        while (contador < numeros.length) {
            System.out.println("Numero en la posición " + contador + ": " + numeros[contador]);
            contador++;

        }
    }/*/

    /*/public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        do {
            System.out.println("Ingresa su edad");
            edad = scanner.nextInt();

            if (edad < 18) {
                System.out.println("la edad minima para ingresar es 18 años");
            }
        } while (edad < 18);
        System.out.println("Bienvenido al sistema. Su edad es: " + edad);
    }/*/

    // Imprimir números del 1 al 10:
    /*/public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }/*/

    /*/public static void main(String[] args) {
        int limite = 20;
        int suma = 0;


        //int i = 2;: Inicializa la variable i a 2, el primer número par.
        //i <= limite;: El ciclo continúa mientras i sea menor o igual al limite
        //i += 2: Después de cada iteración, incrementa i en 2 para obtener el siguiente número par.

        for (int i = 2; i <= limite; i += 2) {
            suma += i;
            //En la primera iteración, i es 2, por lo que se suma 2 a suma (suma = 2).
            //En la segunda iteración, i es 4, por lo que se suma 4 a suma (suma = 6).
            //Esto continúa hasta que i alcanza 20.
        }
        System.out.println("La suma de pares hasta" + limite + "es: " + suma);
    }/*/

    /*/public static void main(String[] args) {
        int[] numeros = {1, 5, 3, 4, 2};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero en la posición " + i + ": " + numeros[i]);
            //numeros: Representa el arreglo de enteros declarado al inicio del código. Este arreglo contiene 5 elementos: 1, 5, 3, 4, 2.
            //numeros: Representa el arreglo de enteros declarado al inicio del código. Este arreglo contiene 5 elementos: 1, 5, 3, 4, 2.
            //i: Es la variable de control del ciclo for. Su valor cambia en cada iteración del ciclo, recorriendo desde 0 hasta la longitud del arreglo menos 1 (en este caso, de 0 a 4).
            //Combinación: Al combinar numeros con los corchetes [] y el valor de i entre paréntesis, se obtiene la siguiente expresión: numeros[i]. Esta expresión significa:
            //numeros: Se accede al arreglo numeros.
            //[i]: Se utiliza la indexación basada en cero para acceder al elemento en la posición i del arreglo. El valor de i determina qué elemento se selecciona.
            //Ejemplo:
            //Si i es 0, la expresión numeros[i] se refiere al primer elemento del arreglo, que es 1.
            //Si i es 1, la expresión se refiere al segundo elemento, que es 5.
            //Y así sucesivamente, hasta llegar al último elemento (posición 4) con valor 2.
        }
    }/*/

    /*/public static void main(String[] args) {

        String cadena = "Hola, mundo!";

        for (int i = 0; i < cadena.length(); i++) {
            //cadena: Representa la variable de tipo cadena que contiene el texto que se desea procesar. En este caso, se asume que la variable cadena ha sido previamente inicializada con algún valor de texto.
            //.charAt(i): Es un método de la clase String en Java que se utiliza para obtener el carácter en una posición específica de una cadena.
            //.charAt(i): Es un método de la clase String en Java que se utiliza para obtener el carácter en una posición específica de una cadena.

            System.out.println("Posición: " + i + " Valor de posición : " + cadena.charAt(i));
        }
    }/*/

    //ContarAtras
    /*/public static void main(String[] args) {
        int contador = 10;

        for (int i = contador; i>= 0; i--) {
            System.out.println(i);
        }
    }/*/
}