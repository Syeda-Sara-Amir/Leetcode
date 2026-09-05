class Solution {
    public boolean isValidSudoku(char[][] board) {

        // my approach

        // first i thought id make a seprarte for loop for row, column, square each.
        // not sure how to check the square, there must be some if condition that works in the squares only

        // i thought id clear the hashmap up after 3 indices have passed in both column and rows but still it wont make up a square so how will i check 

        // now the problem is that even if i seprate diff squares in the row. there are parts of 3 diff squares in one row and in one column. we cant save all that in one hashmap. so should i make 3 hashmaps??? isnt that kinda unprofessional. 



        HashMap<char> row = new Hashmap<>;
        HashMap<char> column = new Hashmap<>;
        HashMap<char> sqr1 = new Hashmap<>;
        HashMap<char> sqr2 = new Hashmap<>;
        HashMap<char> sqr3 = new Hashmap<>;


        boolean sudoko = True;

        // array[row][column]

        for(int i = 0; i < 9; i++){
            columnlen = 1;
            for(int j = 0; j < 9; j++){
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
