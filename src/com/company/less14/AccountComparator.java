package com.company.less14;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account<Integer>> {

    @Override
    public int compare(Account<Integer> o1, Account<Integer> o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
