package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Li {
  public static void main(String[] args) {
    List<String> test = List.of("shashank","vivek","java","adarsh");
    List<String> list = test.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
    long count = test.size();
    System.out.println(count);
    System.out.println(list);

    // Using limit()
    List<String> test1 = List.of("shashank","vivek","java","adarsh","Kuduwa","Pushkar");
    List<String> list1 = test1.stream().limit(5).collect(Collectors.toList());
    long count1 = test1.size();
    System.out.println(count1);
    System.out.println(list1);

    // Using distinct()
    List<String> test2 = List.of("shashank","vivek","java","adarsh","adarsh","vivek");
    List<String> list2 = test.stream().distinct().collect(Collectors.toList());
    long count2 = test2.size();
    System.out.println(count2);
    System.out.println(list2);

    // Using sorted()
    List<String> test3 = List.of("shashank","vivek","java","adarsh");
    List<String> list3 = test3.stream().sorted().collect(Collectors.toList());
    long count3 = test3.size();
    System.out.println(count3);
    System.out.println(list3);

    List<String> test4 = List.of("shashank","vivek","java","adarsh");
    List<String> list4 = test.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
    long count4 = test4.size();
    System.out.println(count4);
    System.out.println(list4);
  }
}
