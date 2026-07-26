// Last updated: 7/26/2026, 10:14:09 PM
class Solution {
    public boolean isPalindrome(int x) {
        int exp=x;
        int pali=0;
        while(exp>0){
            pali = (pali * 10) +(exp % 10);
            exp = exp/10;
        }
        if(pali == x){
            return true;
        }
        else{
            return false;
        }
    }
}