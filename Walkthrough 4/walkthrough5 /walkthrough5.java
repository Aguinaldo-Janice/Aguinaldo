public class Main {
    public static void main(String[] args) {
        
        int[][] dataTable = {
            {3, 6, 9},
            {12, 15, 18},
            {21, 24, 27}
        };

        
        System.out.println("Data Table:");
        for (int row = 0; row < dataTable.length; row++) {
            for (int col = 0; col < dataTable[row].length; col++) {
                System.out.print(dataTable[row][col] + " ");
            }
            System.out.println();
        }
    }
}
