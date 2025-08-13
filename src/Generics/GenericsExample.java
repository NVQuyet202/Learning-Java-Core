package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        // names.add(123); // Lỗi biên dịch
        System.out.println(names); // [Alice]
    }
}
