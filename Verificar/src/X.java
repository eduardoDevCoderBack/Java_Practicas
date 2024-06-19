// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// press Enter. You can now see whitespace characters in your code.
public class X {
    String str = "default";

    X(String s) {
        str = s;
    }

    void print() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new X("hello").print();
    }

}
