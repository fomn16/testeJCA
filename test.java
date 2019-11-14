import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class test {

	public static void main(String[] args) throws Exception{
		
		 KeyGenerator keygen = KeyGenerator.getInstance("AES");
		 SecretKey aesKey = keygen.generateKey();
		
		 Cipher aesCipher;

		// Create the cipher
		aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		
	    // Initialize the cipher for encryption
	    aesCipher.init(Cipher.ENCRYPT_MODE, aesKey);

	    // Our cleartext
	    byte[] cleartext = "This is just an example".getBytes();

	    // Encrypt the cleartext
	    byte[] ciphertext = aesCipher.doFinal(cleartext);

	    // Initialize the same cipher for decryption
	    aesCipher.init(Cipher.DECRYPT_MODE, aesKey);

	    // Decrypt the ciphertext
	    byte[] cleartext1 = aesCipher.doFinal(ciphertext);
	    
	    boolean funciona = cleartext == cleartext1;
	    
	   System.out.print(funciona);
	}
}