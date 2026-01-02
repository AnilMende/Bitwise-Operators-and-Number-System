public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {2,3,1,4,3,2,1,6,4};
        System.out.println(FindingUnique(nums));
    }
    static int FindingUnique(int nums[]){
        int unique = 0;
        for(int num : nums){
            unique ^= num;
        }
        return unique;
    }
}
