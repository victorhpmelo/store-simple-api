package me.api.spring_data_jpa_api.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="tb_products")
@Data
@Getter
@Setter
public class Product {
  @Id
  @Schema(accessMode = Schema.AccessMode.READ_ONLY)
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column(length = 50,nullable = false)
  private String name;
  @Column(scale = 2,nullable = false)
  private Double price;
  private String description;
}
