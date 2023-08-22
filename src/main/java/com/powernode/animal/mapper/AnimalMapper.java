package com.powernode.animal.mapper;

import com.powernode.animal.pojo.Animal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @Author Ywenn
 * @Date 2023/8/22 15:19
 * @注释
 */

@Repository("animalMapper")
public interface AnimalMapper {

    int insert(Animal animal);

    int deleteById(String id);

    int update(Animal animal);

    Animal selectById(String id);

    List<Animal> selectAll();
}
