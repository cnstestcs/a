import java.math.*;
import java.util.*;

public class RSA {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a prime number: ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter another prime number: ");
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)
                          .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = generateE(phi);
        BigInteger d = e.modInverse(phi);

        System.out.println("Encryption keys are: " + e + ", " + n);
        System.out.println("Decryption keys are: " + d + ", " + n);
    }

    public static BigInteger generateE(BigInteger phi) {

        Random rand = new Random();
        BigInteger e, gcd;

        int y, GCD;

        do {
            y = rand.nextInt(phi.intValue() - 1);
            e = BigInteger.valueOf(y);

            gcd = phi.gcd(e);
            GCD = gcd.intValue();

        } while (y <= 2 || GCD != 1);

        return e;
    }
}
