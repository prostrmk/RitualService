package by.prostrmk.ritualServices.model.repository;

import by.prostrmk.ritualServices.model.entity.Product;
import by.prostrmk.ritualServices.model.entity.TypeOfProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findProductsByCountry(String country);
    List<Product> findProductsByMaterial(String material);
    List<Product> findProductsByNameLikeIgnoreCase(String name);
    List<Product> findProductsByWeight(int weight);
    List<Product> findProductsByType(TypeOfProduct typeOfProduct);


}