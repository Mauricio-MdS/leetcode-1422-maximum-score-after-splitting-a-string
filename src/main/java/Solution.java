class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int[] zeroes = new int[n -1];
        if (s.charAt(0) == '0') zeroes[0] = 1;
        for (int i = 1; i < zeroes.length; i++) {
            zeroes[i] = zeroes[i - 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int[] ones = new int[n -1];
        if (s.charAt(n - 1) == '1') ones[n - 2] = 1;
        for (int i = n - 3; i >= 0; i--) {
            ones[i] = ones[i + 1] + (s.charAt(i + 1) == '1' ? 1 : 0);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, zeroes[i] + ones[i]);
        }

        return max;
    }

}