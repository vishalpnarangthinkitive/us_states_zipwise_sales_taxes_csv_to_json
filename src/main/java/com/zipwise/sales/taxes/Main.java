package com.zipwise.sales.taxes;
import com.google.gson.Gson;
import com.zipwise.sales.taxes.entity.ZipwiseSalesTaxes;

public class Main {
    public static void main(String args[]){
        System.out.println(new Gson().toJson(new ZipwiseSalesTaxes()));
    }
}