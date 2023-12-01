public class Demoswitch {
  public static void main(String[] args) {
    // if, else if -> comparision and logical operators && ||
    // switch: single value comparsion (==)

    char vipgrade = 'G'; // G/S/N
    double discount = 0.0d; // Siver(S) ->10%, Gold(G) ->20%
    switch (vipgrade) { // if 中左沒有case, 其他照行
      case 'G':
        discount += 0.1d;
      case 'S':
        discount += 0.1d;
      case 'N':
    }
    System.out.println("discount=" + discount);

    // with break
    discount = 0.0d;
    switch (vipgrade) {
      case 'G':
        discount += 0.2d;
        break; //人手break
      case 'S':
        discount += 0.1d;
        break;
      case 'N':
      default: // default N, other characters, no discount
    } 





    
  }
}
