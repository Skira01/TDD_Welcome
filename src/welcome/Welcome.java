package welcome;

import java.util.Objects;

public class Welcome {

	public static Object welcome(String nom) {
		if((nom == null)||("".equals(nom.trim()))) {
			return "Hello, my friend";
		}
		if(Objects.equals(nom.toUpperCase(), nom)) {
			StringBuilder msg = new StringBuilder("HELLO, ");
			msg.append(nom);
			msg.append("!");
			return msg.toString();
		}
		return "Hello, Bob";
	}

}