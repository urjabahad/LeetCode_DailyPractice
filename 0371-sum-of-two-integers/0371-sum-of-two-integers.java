class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
           int carry = a & b; //to determine positions that need carry
           a= a ^ b; //xor literally stimulates addition except (1,1)case for cary
           b = carry << 1; //b holds carry bits, but they need to be leftshifted first
        }
        return a;
    }
}