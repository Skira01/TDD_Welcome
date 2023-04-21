package welcome;

public class Welcome {

	public static Object welcome(String nom) {
		if((nom == null)||("".equals(nom.trim()))) {
			return "Hello, my friend";
		}
		return "Hello, Bob";
	}

}