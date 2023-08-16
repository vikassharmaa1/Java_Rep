package com.interview.related;

public class OneEditAway {

	public static void main(String[] args) throws Exception {
		

        String q = "tank";
        String p = "tlank";
		if (q == null || p == null
                || q.isEmpty() || p.isEmpty()) {
            throw new IllegalArgumentException("Empty String(s)");
        }

        // if the difference between the strings is bigger than 1 
        // then they are at more than one edit away
        if (Math.abs(q.length() - p.length()) > 1) {
        	throw new StringIndexOutOfBoundsException("Strings length diff is greater than 1");
        }

        // get shorter and longer string
        String shorter = q.length() < p.length() ? q : p;
        String longer = q.length() < p.length() ? p : q;

        int is = 0;
        int il = 0;
        boolean foundDiff = false;
        while (is < shorter.length() && il < longer.length()) {

            if (shorter.charAt(is) != longer.charAt(il)) {

                // first difference was found
                // at the second difference we return false
                if (foundDiff) {
                	foundDiff = false;
                }

                foundDiff = true;

                if (shorter.length() == longer.length()) {
                    is++;
                }
            } else {
                is++;
            }
            il++;
        }
        
        System.out.println("Result: " + foundDiff);   
    }

	}


