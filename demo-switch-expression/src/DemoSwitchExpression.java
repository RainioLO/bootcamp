public class DemoSwitchExpression {
    public static void main(String[] args) {

        System.out.println(getCurrencyCode(Currency.HKD));



    }


    // Java 14: switch expression
    // 1. Return Type
    // 2. No break needed
    // 3. Similar to lambda expression (no code bloack allowed)
    // 4. Compiler ensure all enum values has been catered once.

    // better code review
    public static int getCurrencyCode2(Currency currency) {
        return switch (currency) {
            case HKD -> 1;
            case USD -> 2;
            case RMB -> 3;
        };
    }

    public static int getCurrencyCode3(Currency currency) {
        return switch (currency) {
            case HKD -> {
                String x = "";
                if (x.isEmpty())
                    yield 10;
                else
                    yield 20;
            }
            case USD -> 2;
            case RMB -> 3;
        };
    }


    public static int getCurrencyCode3(String day) {
        return switch (day) {
            case "Monday" -> {
                String x = "";
                if (x.isEmpty())
                    yield 10;
                else
                    yield 20;
            }
            case "Tuesday" -> 50;
            default -> {
                yield 30;  // need default if use switch
            }
        };
    }


    // normal switch
    // no return type
    // cannot check all enum
    public static int getCurrencyCode(Currency currency) {
        int code = -1;
        switch (currency) {
            case HKD:
                code = 1;
                break;
            case USD:
                code = 2;
                break;
            case RMB:
                code = 3;
                break;
        }
        return code;
    }



}
