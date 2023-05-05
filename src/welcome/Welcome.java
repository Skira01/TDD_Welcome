package welcome;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String nom) {
	    if (nom == null || "".equals(nom.trim())) {
	        return "Hello, my friend";
	    }
	    String[] lowercaseNames = new String[10];
	    for (int i = 0; i < lowercaseNames.length; i++) {
	        if (lowercaseNames[i] == null) {
	        	lowercaseNames[i] = "";
	        }
	    }
	    String[] uppercaseNames = new String[10];
	    for (int i = 0; i < uppercaseNames.length; i++) {
	        if (uppercaseNames[i] == null) {
	        	uppercaseNames[i] = "";
	        }  
	    }
	    int[] counts = splitNames(nom, lowercaseNames, uppercaseNames);
	    String[] uniqueLowercaseNames = sameNames(lowercaseNames);
	    String[] uniqueUppercaseNames = sameNames(uppercaseNames);
	    createNbName(lowercaseNames, uniqueLowercaseNames);
	    createNbName(uppercaseNames, uniqueUppercaseNames);
	    StringBuilder msg = new StringBuilder();
	    appendLowercaseNames(msg, uniqueLowercaseNames, counts[0]);
	    appendUppercaseNames(msg, uniqueUppercaseNames, counts[1]);
	    return msg.toString();
	}

	private static int[] splitNames(String nom, String[] lowercaseNames, String[] uppercaseNames) {
	    String[] sousChaines = nom.split(",");
	    int lcCount = 0;
	    int ucCount = 0;
	    for (String s : sousChaines) {
	        s = s.trim();
	        if (s.equals(s.toUpperCase())) {
	            uppercaseNames[ucCount++] = s;
	        } else {
	            lowercaseNames[lcCount++] = s;
	        }
	    }
	    int[] counts = {lcCount, ucCount};
	    return counts;
	}
	
	private static String[] sameNames(String[] sousChaines) {
	    String[] namesUnique = new String[sousChaines.length];
	    for (int i = 0; i < namesUnique.length; i++) {
	        if (namesUnique[i] == null) {
	            namesUnique[i] = "";
	        }
	    }
	    int index = 0;
	    for (int i = 0; i < sousChaines.length-1; i++) {
	        boolean existeDeja = false;

	        for (int j = 0; j < index; j++) {
	            if (sousChaines[i].equals(namesUnique[j])) {
	                existeDeja = true;
	                break;
	            }
	        }

	        if (!existeDeja) {
	            namesUnique[index] = sousChaines[i];
	            index++;
	        }
	    }

	    return namesUnique;
	}
	
	private static int countNames(String[] sousChaines, String nom) {
		int nbOcc = 0;
		for(int i = 0; i<sousChaines.length;i++) {
			if (Objects.equals(sousChaines[i], nom)) {
				nbOcc += 1;
			}
		}
		return nbOcc;
	}
	
	public static void createNbName(String[] sousChaines, String[] namesUnique) {
		for(int i=0;i<namesUnique.length;i++) {
			if((countNames(sousChaines,namesUnique[i])>1)&&!"".equals(namesUnique[i])) {
				StringBuilder nbS = new StringBuilder("(x"+countNames(sousChaines,namesUnique[i])+")");
				namesUnique[i] = namesUnique[i].concat(nbS.toString());
			}
		}
	}
 
	private static void appendLowercaseNames(StringBuilder msg, String[] lowercaseNames, int count) {
		int newCount = count;
		for(int j = 0; j<count;j++) {
			if ("".equals(lowercaseNames[j])) {
				newCount-=1;
			}
		}
	    if (newCount > 0) {
	        msg.append("Hello, ");
	        for (int i = 0; i < newCount; i++) {
	        	if((!"".equals(lowercaseNames[i]))) {
		        		String name = formatName(lowercaseNames[i]);
		        		
		            if (i == newCount - 1) { 
		                if (newCount == 1) {
		                    msg.append(name);
		                } else {
		                    msg.append("and ");
		                    msg.append(name);
		                }
		            } else {
		                msg.append(name);
		                if (i < newCount - 2) {
		                    msg.append(", ");
		                } else if (i == newCount - 2) {
		                    msg.append(" "); 
		                }
		            }
	        	}
	        }
	    }
	}

	private static void appendUppercaseNames(StringBuilder msg, String[] uppercaseNames, int count) {
		int newCount = count;
		for(int j = 0; j<count;j++) {
			if ("".equals(uppercaseNames[j])) {
				newCount-=1;
			}
		}
	    if (newCount > 0) {
	        if (msg.length() > 0) {
	            msg.append(". ");
	            msg.append("AND HELLO, ");
	        } else {
	            msg.append("HELLO, ");
	        }
	        for (int i = 0; i < newCount; i++) {
	        	if(!"".equals(uppercaseNames[i])) {
	            String name = formatName(uppercaseNames[i]);
	            msg.append(name.toUpperCase());
	            if (i < newCount - 1) {
	                msg.append(" AND ");
	            } else {
	                msg.append("!");
	            }
	        }
	        }
	    }
	}

	private static String formatName(String name) {
	    return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
}