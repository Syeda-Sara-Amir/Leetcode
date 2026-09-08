// Question: 
// You are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:
// Each row must contain the digits 1-9 without duplicates.
// Each column must contain the digits 1-9 without duplicates.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
// Return true if the Sudoku board is valid, otherwise return false

// O(n*2) or better

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // my approach

        // first i thought id make a seprarte for loop for row, column, square each.
        // not sure how to check the square, there must be some if condition that works in the squares only

        // i thought id clear the hashmap up after 3 indices have passed in both column and rows but still it wont make up a square so how will i check 

        // now the problem is that even if i seprate diff squares in the row. there are parts of 3 diff squares in one row and in one column. we cant save all that in one hashmap. so should i make 3 hashmaps??? isnt that kinda unprofessional. 



        HashSet<Character> row = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        HashSet<Character> sqr1 = new HashSet<>();
        HashSet<Character> sqr2 = new HashSet<>();
        HashSet<Character> sqr3 = new HashSet<>();


        // (done, hopefully) IMPORTANT FIX: i did not consider that the numbers and the . both are considered chars and "." can repear and it can cause us to return false as a value is being repeated
        //                                  i have to only count the numbers, so we need to cheak if the chars are equal to numbers from 1 to 9


        // after three rows there is another square, after three colums there is another square
        // once we are done with the first three rows we need to check if they are statisfying the condition or not, of yes
        // we clear the square sets and start em new for the next three rows

        // oh no we can check the columns one by one, but we cant check rows, i mean we would need to make a separete hashset for every row cause we need to save all the numbers in a row till we reach the end 

        // array[row][column]
        int rowlen = 1;
        for(int i = 0; i < 9; i++){  // loop that changes rows 

            // we dont need to check the rows separatly cause the j for loop is cheaking every column, we just need to keep changing the column here 
  
            // clearing square sets after 3 rows are done 
            if(rowlen <= 3){
                sqr1.clear();
                sqr2.clear();
                sqr3.clear();
            } else if (rowlen > 3){
                rowlen = 1;
            }


            int columnlen = 1;
            for(int j = 0; j < 9; j++){ // loop that changes columns

                if(board[i][j] >= '1' && board[i][j] <= '9'){   // adding check for 1 to 9 only

                    if(!column.contains(board[i][j])){  // adding into hashset if it doesnt already exist in the set
                        column.add(board[i][j]);
                    } else if(column.contains(board[i][j])){
                        return false;    // return false if the column has the a reapeating value
                    }

                    // ADDING TO SQUARE SET AFTER CHECKING IF IT EXITS THERE ALREADY OR NOT
                    if(columnlen <= 3){
                        if(!sqr1.contains(board[i][j])){
                            sqr1.add(board[i][j]);
                            columnlen ++;
                        } else if(sqr1.contains(board[i][j])){
                            return false;
                        }
                    } else if (columnlen <= 6){
                        if(!sqr2.contains(board[i][j])){
                            sqr2.add(board[i][j]);
                            columnlen ++;
                        } else if(sqr2.contains(board[i][j])){
                            return false;
                        }
                    } else if (columnlen <= 9){
                        if(!sqr3.contains(board[i][j])){
                            sqr3.add(board[i][j]);
                            columnlen ++;
                        } else if(sqr3.contains(board[i][j])){
                            return false;
                        } 
                    } 

                }
            }
            column.clear();  // ofc we need to clear the column hashset for the next rows columns, forgot about that

        }

        return true;
    }
}
