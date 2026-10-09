class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int need = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                // If need is odd, one ')' is missing.
                if (need % 2 == 1) {
                    ans++;
                    need--;
                }

                need += 2;

            } else { // ch == ')'

                need--;

                if (need == -1) {
                    // No matching '('
                    ans++;
                    need = 1;
                }
            }
        }

        return ans + need;
    }
}