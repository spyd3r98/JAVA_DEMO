package javacodechecker;

public class AvoidUsingRsaAlgorithmWithoutOaep {

    public void me(){

        
        Cipher cipher = Cipher.getInstance("RSA/NONE/NoPadding");

        
        Cipher rsa = javax.crypto.Cipher.getInstance("RSA/NONE/NoPadding");

        
        Cipher cip = Cipher.getInstance("RSA/ECB/OAEPWithMD5AndMGF1Padding");
    }
}
