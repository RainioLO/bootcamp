public class DemoRecursion {

  public static void main(String[] args) {
    // 1 + 2 + 3 + 4 + 5 -> 15
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      sum += i;
    }
    System.out.println(sum);

    // recursion: Given int n, return n + (n-1) + (n-2)
    System.out.println(sum(5));

    // System.out.println(calculateProduct(35));


    int product = 1;
    int n = 7;
    while (n > 2) {
      product *= n;
      n -= 2;
      if (n == 1 || n == 2)
        break;
    }
    System.out.println(product);



  }

  public static int sum(int n) { // n = 5
    // base criteria
    if (n == 1) {
      return 1;
    }
    return n + sum(n - 1); // return 5 + sum(4); still cannot return sum(5-1) still no result
    // Step 1: sum(5) return 5 + sum(4);
    // Step 2: sum(4) return 4 + sum(3);
    // Step 3: sum(3) return 3 + sum(2);
    // Step 4: sum(2) return 2 + sum(1);
    // Step 5: sum(1) return 1; //+ sum(0); // base
  }

  // recursion: Given int n
  // if n is odd, return n * (n-2) * (n-4) * ... * 1
  // if n is even, return n * (n-2) * (n-4) * ... * 2

  public static int calculateProduct(int n) {
  if (n == 1) {
  return 1; // Base case: if n is 0 or negative, return 1
  }
  if (n == 2) {
  return 2; // Base case: if n is 0 or negative, return 2
  }
  return n * calculateProduct(n - 2);

  // // Step 1: return 5*(5-2)
  // // Step 2: return 5*(5-2)*(5-2-2)
  // }


}
