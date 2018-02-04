package tk.taroninak.cafe.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {
    public static String hashPassword(String password) {

        byte[] hash;
        try {
            hash = MessageDigest.getInstance("SHA-256").digest(
                    password.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            hash = password.getBytes();
            e.printStackTrace();
        }

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
