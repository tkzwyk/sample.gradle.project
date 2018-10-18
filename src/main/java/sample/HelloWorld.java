package sample;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world. args: " + Arrays.asList(args));

        Integer num = 3;
        System.out.println("Twice " + num + " is " + twice(num));
    }

    public  static Integer twice(Integer input){
        return input * 2;
    }
}
