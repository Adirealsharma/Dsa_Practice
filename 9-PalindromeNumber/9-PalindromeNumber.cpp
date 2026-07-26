// Last updated: 7/26/2026, 10:14:05 PM
class Solution {
public:
    bool isPalindrome(int x) {
        long long revNum = 0;
        int n = x  ;
        if(n<0){
            return false;
        }else{
                while(n!=0){
                int ld = n % 10;
                revNum = (revNum * 10) + ld;
                n=n/10;
                }
            if(revNum == x){
            return true;
            }else{
            return false;
            }
        }

    }
};