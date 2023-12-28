public class DemoIntArray {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 7, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // 2D array (row x column)
        int[][] array = new int[][] {{2, 4, 100}, {9, 2, 1000}};

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.println("row=" + row + ", col=" + col + " , value="
                        + array[row][col]);
            }
        }
        System.out.println(array[1][2]);


        int[][] array3 = new int[][] {{2, 4, 100}, {9, 2, 1000}, {90, 2, 10},
                {9, 100, 1000}};

        int sum1 = 0;
        for (int row = 0; row < array3.length; row++) {
            if (row % 2 == 0)
                continue;
            for (int col = 0; col < array3[0].length; col++) {
                if (col % 2 == 0) {
                    sum1 += array3[row][col];
                }
            }
        }
        System.out.println(sum1);



    }
}
