class Solution {
    public int countGoodNumbers(long n) {
        final int MOD = 1000000007;
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;
        
        long evenChoices = modPow(5, evenCount, MOD);
        long oddChoices = modPow(4, oddCount, MOD);
        
        return (int)((evenChoices * oddChoices) % MOD);
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
