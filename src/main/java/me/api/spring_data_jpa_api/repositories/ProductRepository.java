package me.api.spring_data_jpa_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.spring_data_jpa_api.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
