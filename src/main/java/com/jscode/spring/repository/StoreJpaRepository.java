package com.jscode.spring.repository;

import com.jscode.spring.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreJpaRepository extends JpaRepository<StoreEntity, Long> {

}
