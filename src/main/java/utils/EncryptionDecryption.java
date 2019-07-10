package utils;

import org.jooq.Converter;
import org.postgresql.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class EncryptionDecryption implements Converter {

    private static final byte[] KEY = "TvshmuDNQ.6*}-fZ".getBytes();
    private static final String ALGORITHM = "AES";
    private static final Key key = new SecretKeySpec(KEY, ALGORITHM);

    @Override
    public Object from(Object o) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.decode((String)o)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public Object to(Object o) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return  Base64.encodeBytes(cipher.doFinal(((String)o).getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public Class fromType() {
        return String.class;
    }

    @Override
    public Class toType() {
        return String.class;
    }
}
