package com.example.server.controller;

import com.example.server.entity.TimelapseEntity;
import com.example.server.repository.TimelapseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ilang
 * @since 2022-10-22
 */
@RestController
@RequestMapping("/timelapse")
public class TimelapseController {

    @Autowired
    private TimelapseRepository timelapseRepository;

    @GetMapping("/list")
    public List<TimelapseEntity> list(){
        System.out.println("接口");
        return timelapseRepository.list();
    }

    @PostMapping("/add")
    public boolean add(@RequestBody TimelapseEntity timelapseEntity){
        System.out.println(timelapseEntity.toString());
        boolean save = timelapseRepository.save(timelapseEntity);
        return save;
    }

}
