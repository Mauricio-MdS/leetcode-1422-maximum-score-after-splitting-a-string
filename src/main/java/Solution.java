class Solution {
    public int maxScore(String s) {
        int oneCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') oneCount++;
        }

        int leftZeroes = 0;
        int rightOnes = oneCount;
        int maxScore = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeroes++;
            } else {
                rightOnes--;
            }
            maxScore = Math.max(maxScore, leftZeroes + rightOnes);
        }

        return maxScore;
    }
}