package welcome;

import java.util.ArrayList;
import java.util.List;

public class Welcome {

	public static String welcome(String nom) {
	    if (nom == null || "".equals(nom.trim())) {
	        return "Hello, my friend";
	    }
	    String[] sousChaines = nom.split(",");
	    List<String> lowercaseNames = new ArrayList<>();
	    List<String> uppercaseNames = new ArrayList<>();
	    for (String s : sousChaines) {
	        s = s.trim();
	        if (s.equals(s.toUpperCase())) {
	            uppercaseNames.add(s);
	        } else {
	            lowercaseNames.add(s);
	        }
	    }
	    StringBuilder msg = new StringBuilder();
	    if (!lowercaseNames.isEmpty()) {
	        msg.append("Hello, ");
	        for (int i = 0; i < lowercaseNames.size(); i++) {
	            String name = lowercaseNames.get(i).substring(0, 1).toUpperCase() + lowercaseNames.get(i).substring(1);
	            if (i == lowercaseNames.size() - 1) {
	                if (lowercaseNames.size() == 1) {
	                    msg.append(name);
	                } else {
	                    msg.append("and ");
	                    msg.append(name);
	                }
	            } else {
	                msg.append(name);
	                if (i < lowercaseNames.size() - 2) {
	                    msg.append(", ");
	                } else if (i == lowercaseNames.size() - 2) {
	                    msg.append(" ");
	                }
	            }
	        }
	    }
	    if (!uppercaseNames.isEmpty()) {
	        if (msg.length() > 0) {
	        	msg.append(". ");
	            msg.append("AND HELLO, ");
	        } else {
	            msg.append("HELLO, ");
	        }
	        for (int i = 0; i < uppercaseNames.size(); i++) {
	            String name = uppercaseNames.get(i).substring(0, 1).toUpperCase() + uppercaseNames.get(i).substring(1);
	            msg.append(name.toUpperCase());
	            if (i < uppercaseNames.size() - 1) {
	                msg.append(" AND ");
	            } else {
	                msg.append("!");
	            }
	        }
	    }
	    return msg.toString();
	}
}