package com.company.less9;

public enum Operation {
    SUM {
        @Override
        public int act(int x, int y) {
            return 0;
        }

        @Override
        public void print() {

        }
    },
    MULTIPLY {
        @Override
        public int act(int x, int y) {
            return x * y;
        }

        @Override
        public void print() {

        }
    };

    public abstract int act(int x, int y);

    public abstract void print();
}
