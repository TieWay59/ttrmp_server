package com.tieway59.ttrmp;

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
        //        log.info(tagService.getById(1).getTagId().toString());
        //
        //        String noId = Optional.ofNullable(tagService).map(s -> s.getById(1)).map(Tag::toString).orElse("no id");
        //
        //        log.info(Optional.ofNullable(tagService).map(s -> s.getById(1)).map(Tag::toString).orElse("no id"));

        log.info(tagService.query().eq("tag_id", 2).list().toString());

        log.info(categoryService.
                query().
                eq("category_level", 1).
                list().
                toString());

    }

}
