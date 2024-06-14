// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SobreCargaDeMetodos {

    //Sobrecarga de Métodos: La sobrecarga de métodos en Java permite definir múltiples métodos con el mismo nombre pero diferentes parámetros (tipo, número o ambos) en una misma clase.
    //La resolución de qué método invocar se hace en tiempo de compilación, basado en la firma del método (nombre del método y tipos de parámetros).

    int x(int d) {
        System.out.println("one");
        return 0;
    }
    String x(String i) {
        System.out.println("two");
        return null;
    }

    double x(double s) {
        System.out.println("three");
        return 0.0;
    }

    public static void main(String[] args) {
        SobreCargaDeMetodos obj = new SobreCargaDeMetodos();
        obj.x(4.0);
        obj.x(5);
        obj.x("test");
    }

}