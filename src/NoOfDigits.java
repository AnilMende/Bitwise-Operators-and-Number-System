public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        //Formaula based
        int res = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println("Number of Digits in n are "+ res);

        //System.out.println(countDigits(n,b));
    }
    static int countDigits(int n, int b){
        int count = 0;
        while(n > 0){
            n /= b;
            count++;
        }
        return count;
    }
}
