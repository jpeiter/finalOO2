package br.edu.utfpr.pb.trabalhofinal.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.util.encoders.Hex;

/**
 *
 * @author jpeit
 */
public class StringUtil {

    public static String cripto(String string) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            byte[] bytes = md.digest(string.getBytes(StandardCharsets.UTF_8));
            generatedPassword = Hex.encode(bytes).toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

}
