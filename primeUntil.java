import java.util.Scanner;

public class primeUntil {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your number.");
        int max = userInput.nextInt();

        printPrime(max);
        
        userInput.close();
    } 
    
    public static int printPrime(int max) {
        int numSeq = 1;
        
        for(int i = 1; i<= max; i++) {
            if(isprime(i)) { // Checks if the number that is selected during the loop is prime or not.
                numSeq = i; // Assigns the prime number after being checked to the variable numSeq, the sequence of primes.
                System.out.print(numSeq + ", ");
            }
        }
        return numSeq;
    }

    /*
    * A method that checks whether or not the number is prime, starts at 1 and ends at the user defined limit, loops through 
    * all of them whilst checking how many factors the number has, as we know, prime numbers only have 2 factors, 
    * 1 and itself, thus if the number so happens to have more than 2 factors it is excluded from the return.
    */

    public static boolean isprime(int num) {
        
        int count = 0;
        
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++; // Factor counter.
                }
            }
        
        // Checking the number of factors that a number has, if it is equal to 2, it will return the number.
        
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}