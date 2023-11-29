import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);


        int j = 0;
        sum = 0;
        while (j < 5) {
            sum += j++; // j 放左入sum 先++
        }
        System.out.println("sum=" + sum + " ,j=" + j);

        // continue, break
        // 1, 3, 5, 7, 9 (1-10)

        j = 0;
        sum = 0;
        while (++j <= 10) {
            if (j > 5)
                break;
            sum += j++;
            if (j % 2 == 0) {
                continue;
            }
        }
        System.out.println("sum=" + sum + " ,j=" + j);


        int x = 10;
        int y = 5;

        while (x > 0 && y > 0) { // have more conditions use while loop
            System.out.println("x=" + x + " , y=" + y);
            y--;
            x--;
        }
        // int x = 10;
        // int y = 5;
        // for (x = 10,y = 5 ;x>0 && y>0;x--,y-- ){
        // System.out.println("x=" + x + " , y=" + y);
        // }

        // 0 1 1 2 3 5 8 13 ... < 1000
        int a2 = 0;
        int a1 = 1;
        int e = -1;
        int[] arr = new int[20];
        arr[0] = 1;
        int idx = 1;
        while (e < 1000) {
            e = a1 + a2;
            a2 = a1;
            a1 = e;
            arr[idx++] = a1;
        }
        System.out.println(Arrays.toString(arr));

        // Approach 2:
        a2 = 0;
        a1 = 1;
        e = -1;
        while (true) {
            e = a1 + a2;
            if (e > 1000)
                e -= a2;
            break;
        }
        System.out.println(Arrays.toString(arr));

        boolean isOverLimit = false;
        int limit = 100;
        while (!isOverLimit) {
            if (++limit < 100)
                isOverLimit = true;
        }






        
    }
}
