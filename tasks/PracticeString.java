package tasks;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeString {
  public static void main(String[] args) {
    List<String> test = List.of(" shashank","vivek","java","adarsh","Pushkar","Kshitij","Sagar" );
    List<String> list = test.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
    long count = test.size();
//    System.out.println(count);
    System.out.println("0 : " + list + "\n");

    List<String> list1 = test.stream().limit(5).collect(Collectors.toList());
    System.out.println("1 : Using Limit Condition : " +list1 + "\n");


    List<String> list2 = test.stream().distinct().collect(Collectors.toList());
    System.out.println("2 : Using Distinct Condition : " + list2 + "\n");

    List<String> list3 = test.stream().sorted().collect(Collectors.toList());
    System.out.println("3 : Using Sorted Condition : " +list3 + "\n");

    long list4 = test.stream().count();
    System.out.println("4 : Using count Condition : " +list4 + " \n");

    List<String> list5 = test.subList(1, 6);
    System.out.println("5 : Using subList Condition : " + list5 + "\n");

    List<String> list6 = test.stream().toList();
    System.out.println("6 : Using toList Condition : " + list6 + "\n");

    List<String> list7 = Collections.singletonList(test.get(5));
    System.out.println("7 : Using Collections.singletonList(test.get() Condition : " + list7 + "\n");

    boolean list8 = test.equals("shashank");
    System.out.println("8 : Using equals Condition : " + list8 + "\n");

    int list9 = test.hashCode();
    System.out.println("9 : Using hashCode Condition : " + list9 + "\n");

    Iterator<String> list10 = test.stream().iterator();
    System.out.println("10 "+list10 + "\n");

    Boolean list11 = test.stream().anyMatch(s -> s.contains("Omkar"));
    System.out.println("11 : Using stream().anyMatch Condition from [shashank ,vivek , adarsh , Pushkar , Kshitij , Sagar] : " + list11 + "\n");

    Optional<String> list12 = test.stream().findAny();
    System.out.println("12 : Using stream.findall condition : " + list12 + "\n");

    Stream<Object> list13 = test.stream().flatMap(str -> Stream.of(str));
    System.out.println("13 : Using stream.flatmap condition : " + list13 + "\n");

//    Stream<String> list14 = (Stream<String>) test.stream().collect(Collectors.toSet());
//    System.out.println("14 : Using stream.Collectors.toSet condition : " + list14 + "\n");

    List<String> list15 = test.stream()
//        .peek(x -> System.out.println())
//        .map(String::toUpperCase)
        .peek(x -> x.toUpperCase())
        .collect(Collectors.toList());
    System.out.println("15 : " + list15 + "\n");

  }
}
