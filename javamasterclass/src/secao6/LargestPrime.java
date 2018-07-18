package secao6;

public class LargestPrime {
    public static boolean isPrime(int number) {

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        if (number == 2) {
            return 2;
        }

        for(int i=number; i>1; i--){
            if(number % i ==0){
                if(isPrime(i)){
                    return i;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }
}
