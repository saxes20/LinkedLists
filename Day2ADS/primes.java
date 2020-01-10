
/**
 * Write a description of class primes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primes
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class primes
     */
    public primes()
    {
        // initialise instance variables
    }
    
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        for (int i=1; i <= 100; i++) {
            if (isPrime(i)) {
                list.insert(list, i);
            }
        }
        list.printList(list);
        
        int number = 28;
        if (isPrime (number / 2)) {
                System.out.println(number/2);
                System.out.println(number/2);
            }
        for (int i=1; i < (number / 2); i++) {
            if (isPrime(i)) {
                if (isPrime(number - i)) {
                    System.out.println(i);
                    System.out.println(number-i);
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime (int num) {
        if (num % 2 == 0 && num != 2) { return false; }
        if (num % 3 == 0 && num != 3) { return false; }
        if (num % 5 == 0 && num != 5) { return false; }
        if (num % 7 == 0 && num != 7) { return false; }
        if (num % 11 == 0 && num != 11) { return false; }
        for (int i=13; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
