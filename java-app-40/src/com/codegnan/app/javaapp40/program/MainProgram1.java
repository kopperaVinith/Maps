package com.codegnan.app.javaapp40.program;

import com.codegnan.app.javaapp40.service.ProductService;

import java.util.Map;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
        var productService = new ProductService();

       Map<String,Double> productsMap = productService.getProductsWithNameAndPrice();

      double productPrice =  productService.getProductPrice("Soundbar" ,productsMap);
      if(productPrice > 0) {
          out.println("Product exists with pice as INR " + productPrice);
      } else {
          out.println("Product does not exist");
      }

    }

}
