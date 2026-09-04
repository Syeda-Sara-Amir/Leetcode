// Question: Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.


class Solution {
    public boolean isPalindrome(int x) {
        // brute force 
        String string = String.valueOf(x);
        int j = string.length() - 1;
        for(int i = 0; i <= string.length()/2; i++){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
            j--;
        }
        return true;


        // most efficient and less memory used 

        // 1. Handle Edge Cases
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // 2. Reverse the Second Half
        while (x > reversedHalf) {
            // "Pop" the last digit and "Push" it to reversedHalf
            reversedHalf = reversedHalf * 10 + (x % 10);
            // "Reduce" the original number
            x /= 10;
        }

        // 3. Final Comparison (for even and odd digit counts)
        return x == reversedHalf || x == reversedHalf / 10;

    }
}
