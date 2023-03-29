package com.jscode.spring.controller;

import com.jscode.spring.entity.StoreEntity;
import com.jscode.spring.service.StoreService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/stores")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("")
    public List<StoreEntity> findAll() {
        return storeService.findAll();
    }

    @PostMapping("")
    public String saveStore(@RequestBody StoreEntity storeEntity) {
        System.out.println("컨트롤러1");
        storeService.save(storeEntity);
        System.out.println("컨트롤러2");
        return "store 정상 저장되었습니다.";
    }

    @GetMapping(params = "id")
    public Optional<StoreEntity> findById(@RequestParam Long id) {
        return storeService.findById(id);
    }
}
