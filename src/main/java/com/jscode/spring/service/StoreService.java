package com.jscode.spring.service;

import com.jscode.spring.entity.StoreEntity;
import com.jscode.spring.repository.StoreJpaRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StoreService {

    private final StoreJpaRepository storeJpaRepository;

    public StoreService(StoreJpaRepository storeJpaRepository) {
        this.storeJpaRepository = storeJpaRepository;
    }

    public List<StoreEntity> findAll() {
        return storeJpaRepository.findAll();
    }

    public void save(StoreEntity storeEntity) {
        System.out.println("서비스1");
        storeJpaRepository.save(storeEntity);
        System.out.println("서비스2");
    }

    public Optional<StoreEntity> findById(Long id) {
        return storeJpaRepository.findById(id);
    }
}
