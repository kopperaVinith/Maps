    package com.codegnan.app.javaapp40.program;

import com.codegnan.app.javaapp40.service.ProductService;

import java.util.ArrayList;
import java.util.Map;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(10.12f);
        list.add('e');
        list.add(true);
        list.add("hello");
        list.add(10.0);

        for(Object object : list) {
                if(object instanceof  Integer) {
                    out.println("Integer:" + object);
                } else if(object instanceof Float) {
                    out.println("Float: " + object);
                } else if(object instanceof Character) {
                    out.println("Character: " + object);
                } else if(object instanceof Boolean) {
                    out.println("Boolean:" + object);
                } else if(object instanceof Double) {
                    out.println("Double: " + object);
                }
                else
                out.println("String: " + object);
        }

    }

}
