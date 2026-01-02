public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        //16 -> 1 0 0 0 0 can be written in the form of
        // 1 1 1 1 + 1 => 15 + 1
        //15 ->  1 1 1 1
        //16 & 15 == 0
        if(n == 0){
            System.out.println(false);
        }
        else{
            boolean res = (n & (n-1)) == 0;
            System.out.println(res);
        }
    }
}
