    static boolean isAnagram(String a, String b) {
        // Complete the function
        String la = a.toLowerCase();
        String lb = b.toLowerCase();
        char[] c1 = la.toCharArray();
        char[] c2 = lb.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
       }
