package com.company.less14;

import com.company.less11.Stone;

import java.util.*;
import java.util.function.Consumer;

public class Lesson14 {

    public static void main(String[] args) {
//        generics();
//        Lesson14.<Stone, String>parametrizedMethod(new Stone());
//        collections();
//        elementRemoval();
//        sets();
//        maps();
//        iterators();
        queues();
    }

    private static void iterators() {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> integerListIterator = integers.listIterator();
        integerListIterator.next();
        integerListIterator.forEachRemaining(System.out::println);
        do {
            integerListIterator.previous();
        } while (integerListIterator.hasPrevious());
        integerListIterator.forEachRemaining(System.out::println);
//        do {
//            System.out.println(integerListIterator.next());
//        } while (integerListIterator.hasNext());

        TreeSet<Account<Integer>> treeSet = new TreeSet<>(new AccountComparator());
        treeSet.add(new Account<>(1, 45));
        treeSet.add(new Account<>(2, 565));
        System.out.println(treeSet);
    }

    private static void maps() {
        Map<String, String> map = new HashMap<>();
        map.put("0", "John");
        map.put("110", "John");
        map.put("1", "Andy");
        String key = "1";
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Key is missing: " + key);
        }
        System.out.println(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map.getOrDefault("120", "$$$"));
        System.out.println(map.keySet());
        System.out.println(map.size());
    }

    private static void generics() {
        Stone stone = new Stone();
        Integer i = 123;
        Account<Stone> account1 = new Account<>(stone, 5000);
        System.out.println(account1.getId());

        Account<String> account2 = new Account<>("String as id", 2000);
        System.out.println(account2.getId().trim());

        Account account3 = new Account("123", 3000);
        Integer id = (Integer) account3.getId();
        System.out.println(id);
        workWithAccount(account1);
    }

    private static <T, R> void parametrizedMethod(T val) {
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
        Integer value = printer.<Integer, String>get("1.2");
        System.out.println(value);
    }

    private static void workWithAccount(Account<Stone> account) {
        account.getId();
    }

    private static void collections() {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<String> strings = new ArrayList<>();
        System.out.println(strings);
        strings.add("Java");
        System.out.println(strings);
        strings.add(0, "Book");
        System.out.println(strings);
        List<String> newStrings = new ArrayList<>(strings);
        System.out.println(newStrings);
        newStrings.addAll(strings);
        System.out.println(newStrings);
        newStrings.remove(2);
        System.out.println(newStrings);

        int size = newStrings.size();
        for (int i = 0; i < size; i++) {
            String value = newStrings.get(i);
            System.out.println(value);
        }
        String objectToSearch = "Java1";
        System.out.println(newStrings.indexOf(objectToSearch));
        List<String> anotherList = newStrings.subList(0, 3);
        System.out.println(anotherList);
    }

    private static void elementRemoval() {
        List<String> originalList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        System.out.println(originalList);
        List<String> list1 = new ArrayList<>(originalList);
        System.out.println(list1);
        System.out.println("****************");
        originalList.remove(0);
        System.out.println(originalList);
        System.out.println(list1);
        System.out.println("***************************");
        List<String> list2 = originalList;
        System.out.println(originalList);
        System.out.println(list2);
        System.out.println("***************************");
        originalList.remove(0);
        System.out.println(originalList);
        System.out.println(list2);
        List<Integer> integers = new ArrayList<>();
        doSomeActionsWithList(integers);
        System.out.println(integers);
        List<String> linkedList = new LinkedList<>();
    }

    static void doSomeActionsWithList(List<Integer> list) {
        list.add(1);
    }

    static List<String> stringList = new ArrayList<>();

    static List<String> getStrings() {
        return new ArrayList<>(stringList);
    }

    private static void sets() {
        Set<Integer> set = new HashSet<>();
        int count = 1_000_000;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            set.add(random.nextInt());
        }
        System.out.println(set.size());
    }

    private static void queues() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        queue.offer(1);
        System.out.println(queue);
        queue.add(2);
        queue.add(0);
        queue.add(-1);
        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("****************************");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        System.out.println(deque);
        System.out.println(deque.pollLast());
        deque.push(3);
        System.out.println(deque);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(null);
        list.add(2);
        list.removeLastOccurrence(null);
        System.out.println(list);
    }
}
