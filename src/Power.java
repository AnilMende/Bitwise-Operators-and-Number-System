public class Power {
    public static void main(String[] args) {

        int base = 2;
        int power = 4;
        //Here we are converting the power into the binary format
        //6 => 1 1 0
        int ans = 1;
        while(power > 0){
            //to ignore the zeros and calcualte the 1s powers
            if((power & 1) == 1){
                ans *= base;
            }
            //the power becomes the twice we need to update the base by multiplying it
            base *= base;
            //reduce the power by using the right shift
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
