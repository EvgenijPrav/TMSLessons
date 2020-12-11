package com.company.less8;

public interface Paintable extends Printable {

     void paint();

     static void paintV2() {
         System.out.println("painting");
     }
}
