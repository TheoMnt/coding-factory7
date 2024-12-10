package gr.aueb.cf.ch6;

public class TwoDivArrayApp {
    public static void main(String[] args) {
        //κατα γραμμες και στηλες

        int[][] grid = new int[2][3]; //2 γραμμες 3 στηλες

        //populate

        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        //traverse
        //σαν length η java θεωρει τα rows
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j]);
            }
        }

//        for (int[] row : grid){
//            for (int el: row) {
//                System.out.print(el);
//            }
//
//            System.out.println();
//        }
    }
}