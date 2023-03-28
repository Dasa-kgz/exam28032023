import enums.StpryTypes;
import model.Product;
import model.Store;
import service.StoryService;
import service.impl.StoryServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Product product =new Product(1, "azaaa","adidas",5,5566);
      Product product1=new Product(2,"dd","zara",7,785);
      Product product2=new Product(3,"das","nike",78,55);

        Store store =new Store(1, "Dasa", StpryTypes.ONLINE,"Batken", (List<Product>) product1);
        Store store1=new Store(2, "aza",StpryTypes.PHISICAL,"Bishkek",(List<Product>)product);


        StoryServiceImpl service=new StoryServiceImpl();

       // service.add(4);
        service.findById(2L);
        service.removeByBrand("zara");
        service.filterByBrand("nike");
        service.getAllTovar();
    }
}