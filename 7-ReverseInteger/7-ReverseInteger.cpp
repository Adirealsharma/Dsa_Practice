// Last updated: 7/26/2026, 10:14:07 PM
class Solution {
public:
    int reverse(int x) {
        long long revNum = 0;  // use long long to detect overflow
        while (x != 0) {
            int ld = x % 10;
            revNum = revNum * 10 + ld;
            x /= 10;

            // check overflow beyond 32-bit range
            if (revNum > INT_MAX || revNum < INT_MIN) 
                return 0;
        }
        return (int)revNum;
    }
};
