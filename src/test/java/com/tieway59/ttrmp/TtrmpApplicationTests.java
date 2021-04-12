package com.tieway59.ttrmp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tieway59.ttrmp.service.CategoryService;
import com.tieway59.ttrmp.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class TtrmpApplicationTests {

    @Autowired
    TagService tagService;

    @Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {


        categoryService.
                page(new Page<>(1, 2)).
                getRecords().
                forEach(System.out::println);


    }

}
