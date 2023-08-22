package com.powernode.animal.service.impl;

import com.powernode.animal.service.AnimalServlet;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author Ywenn
 * @Date 2023/8/22 15:14
 * @注释
 */

@Service("animalServlet")
public class AnimalServletImpl implements AnimalServlet {
    @Override
    public void addAnimalMasterName() {
        System.out.println("这是一个添加动物主人的业务代码!");
    }
}
