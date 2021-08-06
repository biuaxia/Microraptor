package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Option;
import cn.biauxia.code.microraptor.generate.mapper.OptionMapper;
import cn.biauxia.code.microraptor.generate.service.OptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OptionServiceImpl extends ServiceImpl<OptionMapper, Option> implements OptionService {

}
