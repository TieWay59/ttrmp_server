package com.tieway59.ttrmp.controller;

import com.tieway59.ttrmp.domain.Tag;
import com.tieway59.ttrmp.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TagController {

    final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @ResponseBody
    @RequestMapping("/tag/{id}")
    public Tag getTagById(@PathVariable("id") int id) {
        return tagService.
                query().
                eq("tag_id", id).
                one();
    }

    @ResponseBody
    @RequestMapping("/tag/all")
    public String getTagById() {
        return tagService.list().toString();
    }

}
