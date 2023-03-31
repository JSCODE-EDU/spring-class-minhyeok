package com.jscode.spring.repository;

import com.jscode.spring.entity.ProductEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByName(String name);

    List<ProductEntity> findByPriceOrderByNameDesc(Long price);

    List<ProductEntity> findByNameAndPrice(String name, Long price);

//    @Query(value = "select ProductEntity " +
//        "from ProductEntity productentity " +
//        "where productentity.name not like :모니터") // 이게 맞는지 테스트는 어떻게 하는 걸까요..ㅠㅠ
//    List<ProductEntity> findAllByNameIsNot(String name); // 이렇게 하면 name을 받을 필요가 없나요?

}
