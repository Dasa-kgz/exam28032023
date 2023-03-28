package service;

import model.Product;

import java.util.List;

public interface StoryService {
    List<Product> add(Product t);

    String findById(Long id);

    String removeByBrand(String brand);

    List<Product> filterByBrand(String Brand);

    List<Product> getAllTovar();
}
