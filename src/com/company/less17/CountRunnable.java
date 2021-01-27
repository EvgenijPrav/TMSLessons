package com.company.less17;

public class CountRunnable implements Runnable {

    CommonRes commonRes;

    public CountRunnable(CommonRes res) {
        commonRes = res;
    }

    @Override
    public void run() {
        commonRes.increment();
    }
}
