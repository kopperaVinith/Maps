    package com.codegnan.app.javaapp40.program;

import com.codegnan.app.javaapp40.service.ProductService;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

    public class MainProgram3 {
        public static void main(String[] args) {
            var productService = new ProductService();

            Map<String,Double> productsMap = productService.getProductsWithNameAndPrice();

          /*  Set<Map.Entry<String,Double>> entry = productsMap.entrySet();
            out.println(entry.size());
            out.println(entry); */

            for(String keys : productsMap.keySet()) {
                out.println(keys);
            }
            for(Double price : productsMap.values()) {
                out.println(price);
            }

           for(Map.Entry<String,Double> entry : productsMap.entrySet())
           {
               out.println(entry.getKey() + ":" + entry.getValue());

           }


        }
    }