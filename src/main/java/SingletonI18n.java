/**
 * Created by nodet on 27/10/17.
 */

import java.util.HashMap;
import java.util.ResourceBundle;


/**
 * Created by $uperuser on 15/03/2017.
 */
public class SingletonI18n {
    private static SingletonI18n instance = null;
    private static HashMap<String, ResourceBundle> hashMapBundle;

    private SingletonI18n() {

        hashMapBundle = new HashMap<String, ResourceBundle>();
        ResourceBundle messages = ResourceBundle.getBundle("mensajes_en");
        hashMapBundle.put("en", messages);
        ResourceBundle messages2 = ResourceBundle.getBundle("mensajes_es");
        hashMapBundle.put("es", messages2);
        ResourceBundle messages3 = ResourceBundle.getBundle("mensajes_al");
        hashMapBundle.put("al", messages3);
    }
    public String getData (String key, String language) {
        return hashMapBundle.get(language).getString(key);

    }
    public static SingletonI18n getInstance() {
        if (instance == null) instance = new SingletonI18n();
        return instance;
    }

}
