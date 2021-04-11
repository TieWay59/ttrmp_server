package com.tieway59.ttrmp.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tieway59.ttrmp.domain.Tag;
import com.tieway59.ttrmp.service.TagService;
import com.tieway59.ttrmp.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
implements TagService{

}
