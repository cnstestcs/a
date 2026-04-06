import java.io.*;

public class SubCipher {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String b = "zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";

        System.out.print("Enter any string: ");
        String str = br.readLine(), encrypt = "", decrypt = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            int j = a.indexOf(c);
            encrypt += b.charAt(j);
        }

        System.out.println("Encrypted data is: " + encrypt);

        for (int i = 0; i < encrypt.length(); i++) {
            c = encrypt.charAt(i);
            int j = b.indexOf(c);
            decrypt += a.charAt(j);  // same logic preserved
        }

        System.out.println("Decrypted data is: " + decrypt);
    }
}
