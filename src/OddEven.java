// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OddEven {
    public static void main(String[] args) {

        int n = 66;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}