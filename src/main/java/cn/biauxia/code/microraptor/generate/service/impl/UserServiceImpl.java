package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.User;
import cn.biauxia.code.microraptor.generate.mapper.UserMapper;
import cn.biauxia.code.microraptor.generate.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
