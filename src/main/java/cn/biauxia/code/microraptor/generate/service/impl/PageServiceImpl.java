package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Page;
import cn.biauxia.code.microraptor.generate.mapper.PageMapper;
import cn.biauxia.code.microraptor.generate.service.PageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {

}
