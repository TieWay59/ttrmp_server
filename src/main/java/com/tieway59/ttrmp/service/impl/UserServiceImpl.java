package com.tieway59.ttrmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tieway59.ttrmp.domain.User;
import com.tieway59.ttrmp.service.UserService;
import com.tieway59.ttrmp.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}




