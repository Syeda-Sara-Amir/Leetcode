// QUESTION: 2078. Two Furthest Houses With Different Colors
/*
There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
*/

class Solution {
    public int maxDistance(int[] colors) {

        // brute force(in this case we arent taking into consideration that the starting index could be diff)
        // even tho this code has been accepted. it isnt the correct code

        int distance = 0;
        int comparing = 0;

        for(int i = 0; i < colors.length; i++){
            if(colors[comparing] != colors[i]){
                distance = i;
            }
        }
        

        return Math.abs(comparing - distance);

    }
}

        // more efficient and correct method

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        // distance from first house
        int rightmost = n - 1;
        while (rightmost > 0 && colors[rightmost] == colors[0]) {
            rightmost--;
        }
        int distFromFirst = rightmost;
        
        // distance from last house
        int leftmost = 0;
        while (leftmost < n - 1 && colors[leftmost] == colors[n - 1]) {
            leftmost++;
        }
        int distFromLast = (n - 1) - leftmost;
        
        return Math.max(distFromFirst, distFromLast);
    }
}
        

  