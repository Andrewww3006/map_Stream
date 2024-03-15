package com.company;
import java.util.Arrays;
import java.util.Collection;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        Collection collection2 = Arrays.asList("1,2,0", "4,5");
        collection1.stream().map(s -> s + "_1").forEach(s-> System.out.print((s+",")));
        System.out.println();
        collection1.stream().mapToInt(s->Integer.parseInt(s.toString().substring(1))).forEach(System.out::print);





    }
}
