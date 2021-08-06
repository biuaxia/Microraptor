package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Link;
import cn.biauxia.code.microraptor.generate.mapper.LinkMapper;
import cn.biauxia.code.microraptor.generate.service.LinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

}
