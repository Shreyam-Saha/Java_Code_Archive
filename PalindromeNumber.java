/*

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example :
	
	Input: 121
	Output: true

	Input: -121
	Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/


class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int s=0;
        if(x>=0){
            while(x>0){
                s = s*10+x%10;
                x = x/10;
            }
            if( n == s )
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
