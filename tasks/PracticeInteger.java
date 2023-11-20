package tasks;

import collections.Li;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class PracticeInteger {
  public static void main(String[] args) {
    List<Integer> test = List.of(15,29,23,48,45,66,47,88,69,10,11,22,93,24,85,46,17,98,19,80);
    List<Integer> list = test.stream().sorted().toList();
    System.out.println("Using sorted : " + list + "\n");

   int list1 = test.indexOf(6);
    System.out.println(list1 + "\n");

    List<Integer> list2 = test.stream().toList();
    System.out.println("Using tolist : " + list2 + "\n");

    long list3 = test.stream().count();
    System.out.println("using count : " + list3 + "\n");

    List<String> s = Arrays.asList("Vivek","for","Vivek","vivek","vIvEk");
    Map<String,Long> map = s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(map);

    List<Integer> num = Arrays.asList(1,1,2,3,4,5,5,6,6,6,7,7,7,7,7,8,8,8,8,8,8);
    Map<Integer,Long> l = num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println("3 : " + l + "\n");

    List<Integer> list4 = test.stream().dropWhile(x -> x < 70).collect(Collectors.toList());
    System.out.println("4 : Using stream.whileDrop condition : " + list4 + "\n");

    Boolean list5 = test.stream().allMatch(x -> x % 2 == 0 || x % 1 == 0);
    System.out.println("5 : using stream.allMatch : " + list5 + "\n");

    List<Integer> list6 = test.stream().map(n -> n * n).collect(Collectors.toList());
    System.out.println("6 : Using stream.map : "  + list6);


    List<List<Double>> test1 = Arrays.asList(
        Arrays.asList(1.1,2.2,3.3),
        Arrays.asList(4.4,5.5,6.6),
        Arrays.asList(7.7,8.8,9.9));

    DoubleStream list7 = test1.stream().flatMapToDouble(x -> x.stream().mapToDouble(Double::doubleValue));
    double sum = list7.sum();
    System.out.println("7 : Using flatmaptodouble : " + sum + "\n");
  }
}
