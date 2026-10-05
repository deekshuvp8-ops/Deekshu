import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class SymmetricKeyExample {
    public static void main(String[] args) throws Exception {
        // Initialize KeyGenerator for AES (128, 192, or 256 bits)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); 

        // Generate the secret key
        SecretKey secretKey = keyGen.generateKey();

        // Convert key to Base64 String for printable storage
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        
        System.out.println("Generated AES Key (Base64): " + encodedKey);
    }
}