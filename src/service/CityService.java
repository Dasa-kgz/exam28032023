package service;

import model.City;
import model.Store;

import java.util.List;

public interface CityService<desc> {
    List<Store> getAllStoresByBrand(String brand);
    List<Store> similarStoreTypes(Enum type, City city);

    List<Store> quantityTovar(int x, String asc);
    //  List<Store> quantityTovar(int x, String asc desc);
}
