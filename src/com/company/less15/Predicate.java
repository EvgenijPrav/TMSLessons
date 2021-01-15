package com.company.less15;

@FunctionalInterface
public interface Predicate<T> {

    boolean isValueAcceptable(T t);
}
