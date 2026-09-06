// Question: 
// You are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:
// Each row must contain the digits 1-9 without duplicates.
// Each column must contain the digits 1-9 without duplicates.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
// Return true if the Sudoku board is valid, otherwise return false

// O(n*2) or better

java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // my approach

        // first i thought id make a seprarte for loop for row, column, square each.
        // not sure how to check the square, there must be some if condition that works in the squares only

        // i thought id clear the hashmap up after 3 indices have passed in both column and rows but still it wont make up a square so how will i check 

        // now the problem is that even if i seprate diff squares in the row. there are parts of 3 diff squares in one row and in one column. we cant save all that in one hashmap. so should i make 3 hashmaps??? isnt that kinda unprofessional. 



        HashSet<Char> row = new HashSet<>();
        HashSet<Char> column = new HashSet<>();
        HashSet<Char> sqr1 = new HashSet<>();
        HashSet<Char> sqr2 = new HashSet<>();
        HashSet<Char> sqr3 = new HashSet<>();


        boolean sudoko = True;

        // array[row][column]

        for(int i = 0; i < 9; i++){  // loop that changes rows 
            columnlen = 1;
            for(int j = 0; j < 9; j++){ // loop that changes columns
                if(columnlen <= 3){
                    // add to first square
                } else if (columnlen <= 6){
                    // add to second square
                } else if (columnlen <= 9){
                    // add to third square  
                } 
            }
        }
    }
}
