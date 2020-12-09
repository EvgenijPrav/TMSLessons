package com.company.less7;

public class Lesson7 {

    public static void main(String[] args) {
//        innerClasses();
//        nestedStaticClasses();
//        inheritance1();
        inheritance2();
    }

    public static void innerClasses() {
        Person tom = new Person("Tom", "pass12345");
        tom.displayPersonInfo();
        tom.getAccount().displayAccountInfo();
        Person.Account account = tom.getAccount();
        account.displayAccountInfo();
        System.out.println(account.getPassword());
        doSomethingWithAccount(account);
    }

    public static void doSomethingWithAccount(Person.Account account) {
        // some stuff with account
    }

    public static void nestedStaticClasses() {
        Math.Factorial factorial = new Math.Factorial(10);
        factorial.name = "1234567";
        System.out.println("Factorial of number " + factorial.getInputParam() + " equals to " + factorial.getResult());
    }

    public static void inheritance1() {
        Employee employee = new Employee(25, "Tom", 150_000, "Oracle");
        employee.getEmployeeInfo();
        employee.getInfo();
        Human human = new Employee(30, "Mary", 120_000, "Google");
        human.getInfo();
        someMethod(human);
    }

    public static void someMethod(Human human) {
        if (human instanceof Employee) {
            Employee employee = (Employee) human;
            employee.getEmployeeInfo();
        }
    }

    public static void inheritance2() {
        Employee employee = new Employee(25, "Tom", 150_000, "Oracle");
        Human human = new Employee(30, "Mary", 120_000, "Google");
        Human human2 = new Employee(30, "Mary", 120_000, "Google");
        employee.getInfo();
        human.getInfo();
        employee.say();
        employee.getAge();
        System.out.println(human2.equals(human));
    }
}

class Person {
    private String name;
    private Account account;

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPersonInfo() {
        System.out.println("Person name: " + name + "; password - " + account.password);
    }

    public Account getAccount() {
        return account;
    }

    // Inner class (Внутренний)
    class Account {

        private String password;

        Account(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void displayAccountInfo() {
            System.out.println("Account info: person - " + Person.this.name + " , password - " + password);
        }
    }
}
