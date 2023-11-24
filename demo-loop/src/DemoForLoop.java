public class DemoForLoop {
    public static void main(String[] args) {

        int x = 2;
        // counter initialization ; counter's continuous condition ; counter's movement
        // Step 1 int i = 0 is initialization
        // Step 2 i < 4 asking whether i<4
        // Step 3 Yes -> x*=2
        // Step 4 sysout
        // Step 5 i++ execute i++ (i 的動作)
        // Step 6 i < 4 ? i is 1
        // Step 7 Yes -> x*=2
        // Step 8 sysout
        // Step 9 i++
        // Step 10 if i<4 i =2
        // Step 11 yes -> x *=2
        // Step 12 sysout
        // Step 13 i++
        // Step 14 if i<4 i = 3
        // Step 15 Yes -> x *=2
        // Step 16 sysout
        // Step 17 i++
        // Step 18 if i<4 i=4
        // Step 19 No -> Exit loop

        for (int i = 0; i < 4; i++) { // 0,1,2,3
            x *= 2;
            System.out.println("x=" + x);
        }

        // x *= 2;
        // System.out.println("x=" + x);
        // x *= 2;
        // System.out.println("x=" + x); // 16
        // x *= 2;
        // System.out.println("x=" + x); // 32

        // 0+1+2+3+4+...10 -> total

        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += i;
        }
        System.out.println("total=" + total);


        // 0 + 2 + 4 + ... + 10 -> total
        // Method 1
        total = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("total 1=" + total);

        // Method 2
        // total = 0;
        // int times = 20;
        // for (int i = 0; i < (times / 2 + 1); i++) {
        // total += i * 2;
        // }
        // System.out.println("total 2=" + total);


        // 0-100
        // i) 0-50, odd -> sum
        // ii) 51-100, even -> another sum2
        // iii) total -> sum1 * sum2

        total = 0;
        int sum1 = 0;
        int sum2 = 0;

        // for (int i = 0; i < 101 ;i++) {

        // if (i<51 && i%2==1) {
        // sum1 +=i;
        // } else if (i%2==0 && i>50) {
        // sum2 +=i;
        // }
        // }

        for (int i = 0; i < 101; i++) {

            if (i < 51) {
                if (i % 2 == 1) {
                    sum1 += i;
                }
            } else if (i % 2 == 0) {
                sum2 += i;
            }
        }
        int totaltimes = sum1 * sum2;
        System.out.println("total times=" + totaltimes);

        // continue
        // sum up all odd number (100)
        int sum = 0;
        for (int i = 0; i < 101; i++) { // 0,1,2,3,4..100``
            // skip even number: continue
            if (i % 2 == 0) {
                continue; // Go to the next iteration, skip the rest of codes
            }
            // For even number, the following code will be skipped
            sum += i;
        }
        System.out.println("sum=" + sum);


        // break -> exit the loop directly
        for (int i = 0; i < 4; i++) {

            if (i == 2) {
                break;
            }
            System.out.println("i=" + i);
        }
        // i=0
        // i=1

        for (int i = 0; i < 4; i++) {

            if (i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }
        // i=0
        // i=1
        // i=3



        // sum up all odd number (0-100)
        // i) sum <=200
        // The loop should be ended at which number of i?
        sum = 0;
        int i = 0;
        for (i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;

            if (sum > 200) {
                sum -= i;
                break;
            }
        }
        i -= 1;
        System.out.println("i=" + i + ", sum=" + sum);


        String str = "abc pol ijk def xyz";
        char target = 'f';
        int n = 0;
        boolean found = false;
        for (i = 0; i < str.length(); i++) { // charAt(i)
            if (str.charAt(i) == target) { //length and charAt 是一對
            
                n = i + 1;
                found = true;
            }
        }
        if (found) {
            System.out
                    .println("Found " + target + " at the " + n + "th character");
        } else {
            System.out.println("Not found");
        }

        // String searchMe = "peter piper picked a peck of pickled"; //count 'P'
        // for (int i =0, i< searchMe.length())



    }
}
