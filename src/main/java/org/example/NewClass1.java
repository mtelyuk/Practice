package org.example;

import java.math.BigDecimal;
import java.util.Set;

public abstract class NewClass1 {

    BigDecimal bg;

    public void method2() {
        bg = bg.multiply(new BigDecimal(2));

    }


    public abstract Set<Character> characters(char[] arr);

}
