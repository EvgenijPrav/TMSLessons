package com.company.less7;

public class Lesson7 {

    public static void main(String[] args) {
//        innerClasses();
        nestedStaticClasses();
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
