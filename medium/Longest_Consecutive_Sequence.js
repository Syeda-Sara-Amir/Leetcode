// QUESTION: 
// Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
// A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.
// You must write an algorithm that runs in O(n) time.


// my solution: No idea, might have to use hashset and then run some loops so set it all out
// easy answer: sort it out but the conplexity is gonna be O(nlogn)


// solution that satisfies the time restriction
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
