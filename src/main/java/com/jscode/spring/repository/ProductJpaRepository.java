package com.jscode.spring.repository;

import com.jscode.spring.entity.ProductEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByName(String name);
//    @Query(value = "select price " +
//        "from ProductEntity productentity " +
//        "order by ")
    List<ProductEntity> findByPrice(Long price);
}
