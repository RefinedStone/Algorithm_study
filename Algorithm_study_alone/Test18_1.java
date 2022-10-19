public class Test18_1 {

    public static void main(String[] args) {

        int[][] numbers = new int[][]{{1, 0, 1, 1, 1, 1}, {1, 0, 1, 0, 1, 0}, {1, 0, 1, 0, 1, 1}, {1, 1, 1, 0, 1, 1}};
        DFS(numbers, 0, 0, 1);

        System.out.println(smallestAnswer);
    }

    static int smallestAnswer = Integer.MAX_VALUE;

    static void DFS(int[][] numbers, int row, int col, int depth) {
        // Check if we are out of bounds or at a wall
        if (row < 0 || row >= numbers.length || col < 0 || col >= numbers[0].length || numbers[row][col] != 1) {
            return;
        }
        // 최적화
        if (depth >= smallestAnswer){
            return;
        }

        // If we have reached the end, update the answer and return
        if (row == numbers.length - 1 && col == numbers[0].length - 1) {
            smallestAnswer = Math.min(smallestAnswer, depth);
            return;
        }

        // Mark the current cell as visited
        numbers[row][col] = 0;

        // Recursively visit all adjacent cells
        DFS(numbers, row - 1, col, depth + 1);
        DFS(numbers, row + 1, col, depth + 1);
        DFS(numbers, row, col - 1, depth + 1);
        DFS(numbers, row, col + 1, depth + 1);

        // Unmark the current cell
        numbers[row][col] = 1;
    }
}