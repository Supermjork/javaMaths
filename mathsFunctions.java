public class mathsFunctions {
    public static void main(String[] args) {
        System.out.println(pow(5, 6));
        System.out.println(abs(-67.43));
        System.out.println(round(2.58788903239023453));
        System.out.println(isprime(4));
        printNumbers(5);
    
    }
    
    
    public static double pow(double base, double exponent) {
        
        double cmnBase = base;
        double endBase = 1/base;
        
        if(exponent > 0){
            for (int i = 1; i < exponent; i++) {
                base = base * cmnBase;
            }
        return base;

        } else if(exponent < 0) {
            for (int i = -1; i > exponent; i--)
            base = base * cmnBase;
            endBase = 1/base;

        return endBase;
        
        } else {
            base = 1;
        }
        return base;
    }
    
    public static double abs(double num) {

        double absVal = 0;
        
        if(num < 0 ) {
            absVal = num * (-1);
        } else {
            absVal = num;
        }
        
        return absVal;
    }
    
    public static int round(double num) {
        
        double newNum = num + 0.5;
        int rounded = (int) newNum;
        
        return rounded;
    }
    
    public static boolean isprime(int num) {
        
        int count = 0;
        
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String printNumbers(int num) {
        
        String numSeq = "";
        
        for(int i = 1; i <= num; i++) {
            numSeq = "[" + i + "]";
            System.out.print(numSeq);
        }
        return numSeq;
        
    }    
}