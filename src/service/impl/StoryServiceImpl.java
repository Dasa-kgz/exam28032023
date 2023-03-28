package service.impl;

import model.Product;
import model.Store;
import service.StoryService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StoryServiceImpl implements StoryService {
    private  Store store;
    //private Product products;
    @Override
    public List<Product> add(Product t) {
            store.getProducts().add(t);

            return store.getProducts() ;
    }

    @Override
    public String findById(Long id) {
        for (Product product: store.getProducts()){
            if (product.getId()==id){
                System.out.println(product);
                return "Ura";}



        }
        return "ne ura";
    }

    @Override
    public String removeByBrand(String brand) {
        List<Product>productList=store.getProducts();
        productList.removeIf(x->x.getBrand().equals(brand));
        for (Product str: store.getProducts()){
            System.out.println(str);

        }

        return brand;
    }

    @Override
    public List<Product> filterByBrand(String Brand) {
        List<Product>productList=new ArrayList<>();
        for (Product product: store.getProducts()){
           productList.addAll(product.getBrand());
            Product finalProduct = product;
            product= (Product) productList.stream().filter(x-> x.getBrand().equals(Brand));
        }return store.getProducts();

    }

    @Override
    public List<Product> getAllTovar() {

        return store.getProducts();
    }
}
