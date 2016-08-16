
/*

 Keep in Mind : Check Corner Cases its important 
 
 NOTE: Good clarification questions:
    What should be the return value if the needle is empty?
    What if both haystack and needle are empty?
    For the purpose of this problem, assume that the return value should be -1 in both cases.

*/

class strStr {

    public static void main(String[] args) {

        int index = strStr("b", "b");
//        int index = strStr("aabaaaababaabbbabbabbbaabababaaaaaababaaabbabbabbabbaaaabbbbbbaabbabbbbbabababbaaabbaabbbababbb", "bba");
//        int index = strStr("bbbbbbbbab", "baba");
//        int index = strStr("abcbcegh", "bce");
        System.out.println(index);

    }

    public static int strStr(final String haystack, final String needle) {

        if (haystack.equals(needle)) {
            return 0;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int ptr = 0;

        if (h.length == 0 || n.length == 0) {
            return -1;
        }

        for (int i = 0; i < h.length; i++) {

            int k = 0;
            ptr = 0;
            if (i + n.length < h.length) {

                for (int j = i; j < i + n.length; j++) {

                    if (h[j] == n[k]) {
                        ptr++;
                        k++;
                    }

                    if (ptr == n.length) {
                        return i;
                    }

                }
            }

        }

        return -1;
    }

}
