package welcome;

import java.util.Objects;

public class Welcome {

	public static String welcome(String nom) {
	    if (nom == null || "".equals(nom.trim())) {
	        return "Hello, my friend";
	    }
	    StringBuilder msg = new StringBuilder("Hello, ");
	    String[] sousChaines = nom.split(",");
	    for (int i = 0; i < sousChaines.length; i++) {
	        String nomCapitalized = sousChaines[i].trim().substring(0, 1).toUpperCase() + sousChaines[i].trim().substring(1);
	        msg.append(nomCapitalized);
	        if (i != sousChaines.length - 1) {
	            msg.append(", ");
	        }
	    }
	    if (nom.equals(nom.toUpperCase())) {
	        msg = new StringBuilder("HELLO, ");
	        msg.append(nom);
	        msg.append("!");
	    }
	    return msg.toString();
	}

}