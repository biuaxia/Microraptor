package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Plugin;
import cn.biauxia.code.microraptor.generate.mapper.PluginMapper;
import cn.biauxia.code.microraptor.generate.service.PluginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PluginServiceImpl extends ServiceImpl<PluginMapper, Plugin> implements PluginService {

}
