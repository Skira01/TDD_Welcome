package welcome;

import java.util.Objects;

public class Welcome {

	public static String welcome(String nom) {
	    if (nom == null || "".equals(nom.trim())) {
	        return "Hello, my friend";
	    }
	    StringBuilder msg = new StringBuilder("Hello, ");
	    if (nom.contains(",")) {
	        String[] sousChaines = nom.split(",");
	        msg.append(sousChaines[0].substring(0, 1).toUpperCase() + sousChaines[0].substring(1));
	        msg.append(", ");
	        msg.append(sousChaines[1].substring(0, 1).toUpperCase() + sousChaines[1].substring(1));
	    } else {
	        String nomCapitalized = nom.substring(0, 1).toUpperCase() + nom.substring(1);
	        msg.append(nomCapitalized);
	    }
	    if (nom.equals(nom.toUpperCase())) {
	        msg = new StringBuilder("HELLO, ");
	        msg.append(nom);
	        msg.append("!");
	    }
	    return msg.toString();
	}

}