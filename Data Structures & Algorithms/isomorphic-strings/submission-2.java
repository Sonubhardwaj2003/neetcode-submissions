class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sA = new int[256];
        int[] tA = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sA[c1] != tA[c2]) {
                return false;
            }

            sA[c1] = i + 1;
            tA[c2] = i + 1;
        }

        return true;
    }
}