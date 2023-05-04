package welcome;

public class Welcome {

	public static String welcome(String nom) {
	    if (nom == null || "".equals(nom.trim())) {
	        return "Hello, my friend";
	    }
	    String[] sousChaines = nom.split(",");
	    StringBuilder msg = new StringBuilder();
	    StringBuilder capitalizedMsg = new StringBuilder();
	    boolean hasUppercaseName = false;
	    boolean isFirstLowercaseName = true;
	    for (int i = 0; i < sousChaines.length; i++) {
	        String nomCapitalized = sousChaines[i].trim().substring(0, 1).toUpperCase() + sousChaines[i].trim().substring(1);
	        if (sousChaines[i].equals(sousChaines[i].toUpperCase())) {
	            hasUppercaseName = true;
	            capitalizedMsg.append("HELLO, ");
	            capitalizedMsg.append(nomCapitalized);
	            capitalizedMsg.append(" !");
	        } else {
	            if (isFirstLowercaseName) {
	                msg.append("Hello, ");
	                isFirstLowercaseName = false;
	            }
	            msg.append(nomCapitalized);
	            if (i != sousChaines.length - 1) {
	                msg.append(", ");
	            }
	        }
	    }
	    if (hasUppercaseName) {
	        if (msg.length() > 0) {
	            msg.append(". AND ");
	        }
	        msg.append(capitalizedMsg);
	    }
	    return msg.toString();
	}
 
}