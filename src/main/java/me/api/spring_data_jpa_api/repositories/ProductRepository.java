package me.api.spring_data_jpa_api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.api.spring_data_jpa_api.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
    Product findByName(String name);

    @Query(value = "SELECT * FROM tb_products WHERE id = :id", nativeQuery = true)
    Optional<Product> findById(@Param("id") String id);
}
