package JavaPrograms.DataStructures;

public class ReverseAndPallindrome {

    static int reversDigits ( int num){
        int rev_num = 0;
        if(num < 0){
            num = num* -1;
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            return  -rev_num;
        }
        else{
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            return rev_num;
        }

    }
    public static boolean isPalindrome(int x) {
        int temp = 0, pop = 0, reverse = 0;
        temp = x;
        if (x >= 0 && x%10 !=0) {
            while (x > reverse) {
                reverse = reverse * 10 + x % 10;
                x /= 10;
            }
            return x == reverse || x == reverse / 10;
        } else {
            return false;
        }
    }
        public static void main(String[] args) {
            int num = 1534236469;
         /*   System.out.println("Reverse of no. is "
                    + reversDigits(num));
         */
            System.out.println(isPalindrome(10));
    }
}
