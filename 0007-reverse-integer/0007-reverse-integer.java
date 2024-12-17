class Solution {
    public int reverse(int x) {
        long rev=0;
        int r = Math.abs(x);
        while(r != 0){
            rev=rev*10+r%10;
            r=r/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
       return (x < 0) ? (int) -rev : (int) rev;
    }
}