import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {

    public static void main(String[] args) throws Exception {
        List<String> strings =
                new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
        List<String> result = new ArrayList<>();
        // filter out string with length <=5
        for (String str : strings) {
            if (str.length() > 5) {
                result.add(str);
            }
        }
        System.out.println(result);


        // stream()
        // list object can invoke stream() method

        List<String> result2 = strings.stream() // now is Stream // similar to for loop
                // List<String> bound the type.
                .filter(s -> s.length() > 5) // Predicate: s -> s.length() > 5 // what left is inside()
                .collect(Collectors.toList()); // .collect to change the shape to List
        System.out.println(result2);


        List<Cat> cats = new ArrayList<>(List.of(new Cat("ABV", 2),
                new Cat("DEF", 3), new Cat("IJK", 1)));
        // stream(), filter name startWith "D" && age < 2

        // Filter Cat and return List<Cat>
        List<Cat> result3 = cats.stream().filter(
                cat -> cat.getName().startsWith("I") && cat.getAge() < 2)
                .collect(Collectors.toList());
        System.out.println(result3);

        // Filter Cat and return List<String>
        List<String> result4 = cats.stream().filter(
                cat -> cat.getName().startsWith("I") && cat.getAge() < 2)
                .map(e -> e.getName()).collect(Collectors.toList()); // use map to getname and put into the result List<String>
        System.out.println(result4); // use map to change the phase

        List<Dog> dogs = cats.stream().map(e -> { // stream is like the for loop
            return new Dog(e.getAge());
        }).collect(Collectors.toList());

        System.out.println(dogs);

        List<Dog> dogss = new ArrayList<>();
        for (Cat cat : cats) {
            dogss.add(new Dog(cat.getAge()));
        }
        System.out.println(dogss);

        List<Staff> staffs = new ArrayList<>(List
                .of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

        double sum = 0.0d;
        for (Staff staff : staffs) {
            sum += staff.getSalary();
        }
        System.out.println(sum);

        double max = -1;
        for (Staff staff : staffs) {
            if (staff.getSalary() > max) {
                max = staff.getSalary();
            }
        }

        // stream()

        List<Double> total = staffs.stream().map(e -> e.getSalary())
                .collect(Collectors.toList());


        double sumOfSalary = staffs.stream() // stream() --> auto box from double to Double
                .map(e -> e.getSalary()) // map to change from Staff staff to Double salary
                .mapToDouble(d -> d) // DoubleStream to have the maths method, intermediate operation
                .sum(); // Double to call .sum() / terminate operation

        System.out.println(sumOfSalary);

        long countOfStaff = staffs.stream().map(e -> { // map is the intermediate operation
            System.out.println("hello");
            return e;
        }).count(); // terminate operation
        System.out.println("count= " + countOfStaff);

        List<Cat> cats2 = new ArrayList<>(List.of(new Cat("DEF", 3),
                new Cat("DEF", 3), new Cat("IJK", 1)));
        Set<Cat> result5 = cats2.stream().collect(Collectors.toSet()); // set to kick out duplicate, onlt one
        System.out.println(result5);


        // distinct -> remove duplicated elements
        List<Cat> result6 = cats2.stream().distinct()
                .filter(e -> e.getAge() >= 3).collect(Collectors.toList());
        System.out.println(result6);


        // Prepare 2 customers, each of them has his own addresses

        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(); // LList<Address> addresses = new ArrayList<>()
        customer1.addAddress("Sample Address Line 1", "Sample Address Line 2");
        customer1.addAddress("ABXD EFG", "XYZ IJK");

        Customer customer2 = new Customer();
        customer2.addAddress("123456", "78910");

        customers.add(customer1);
        customers.add(customer2);

        // Retrieve add addresses from a list of customers // stream() to have the map, filter, flapMap methods...
        List<Customer.Address> addresses = // list of Customer 's addresses
                customers.stream().flatMap(c -> c.getAddress().stream()) // list of list use flatMap
                        .collect(Collectors.toList()); // Collectors to collect the stream
        System.out.println(addresses);

        List<List<Customer.Address>> listOfAddress = customers.stream()
                .map(c -> c.getAddress()).collect(Collectors.toList());
        System.out.println(listOfAddress);

        // List<List<Integer>>

        List<List<Integer>> intergerList =
                new ArrayList<>(List.of((new ArrayList<>(List.of(1, 3, 5))),
                        new ArrayList<>(List.of(2, 4, 6))));

        List<Integer> integers = intergerList.stream().flatMap(e -> e.stream())
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(integers);

        // List<String>
        List<Cat> catList = new ArrayList<>(List.of(new Cat("Jenny", 10),
                new Cat("Karis", 8), new Cat("Andy", 14)));

        // return a list of cat names, with age > 9, order by the ages of cats

        // use map to obtain the required data type
        // use filter to filiter the data

        List<String> catNames = catList.stream().filter(e -> e.getAge() > 9)
                .sorted((i1, i2) -> { // lambda -> comparator return .... > ? 1: -1;
                    return i1.getAge() > i2.getAge() ? 1 : -1;
                })// Integer.compare(i1.getAge(), i2.getAge()))
                .map(k -> k.getName()).collect(Collectors.toList()); // accending order.

        System.out.println(catNames);

        boolean hasKaris =
                catList.stream().anyMatch(e -> "Karis".equals(e.getName()));

        Map<Boolean, List<Cat>> catMap = catList.stream()
                .collect(Collectors.partitioningBy(cat -> cat.getAge() >= 10));

        System.out.println(catMap);



    }
}
