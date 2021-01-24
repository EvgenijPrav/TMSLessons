package com.company.less16;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lesson16 {

    public static void main(String[] args) {
        IntPredicate predicate = value -> value > 3;
        long count = IntStream
                .of(1, 2, 3, 4, 5, 6, -1, -2, -3)
                .filter(x -> x > 3)
                .count();
        // System.out.println(count);


        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n < 5;
            }
        };

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Alice", "Bob", "Mark", "Andy");
        names.stream()
                .map(function1)
                .filter(n -> n < 5);
        //.forEach(l -> System.out.println(l));

        List<AccountDataClass> list = new ArrayList<>();
        list.stream()
                .map((Function<AccountDataClass, AccountDomainClass>) accountDataClass -> null)
                .sorted()
                .limit(2)
                .map(new Function<AccountDomainClass, AccountPresentationClass>() {
                    @Override
                    public AccountPresentationClass apply(AccountDomainClass accountDomainClass) {
                        return null;
                    }
                });

        IntStream
                .of(1, 2, 3, 4, 5, 6, -1, -2, -3)
                .sorted();
                // .forEach(System.out::println);

        List<Phone> phones = new ArrayList<>();
        Collections.addAll(
                phones,
                new Phone("Pixel", "Google", 699),
                new Phone("iPhone", "Apple", 899),
                new Phone("Galaxy", "Samsung", 799)
        );

        phones.stream()
                .sorted(new NameComparator())
                .forEach(System.out::println);
        System.out.println();
        phones.stream()
                .sorted(new ManufacturerComparator())
                .forEach(System.out::println);
        System.out.println();
        phones.stream()
                .sorted(new CostComparator())
                .skip(10)
                .limit(1)
                .map(x -> x.getCost())
                .forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Optional<Integer> integerOptional = numbers.stream().max(Integer::compare);
        System.out.println(integerOptional.get());
        Optional<Integer> optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Optional is not present");
        }
        System.out.println(optional.orElse(-1));
        System.out.println(optional.orElseGet(() -> new Random().nextInt()));
//        System.out.println(getLength(null));
        optional.ifPresent(System.out::println);
    }

    private static int getLength(String value) {
//        if (value != null) {
//            return value.length();
//        } else  {
//            return 0;
//        }
        return value != null ? value.length() : 0;
    }
}
