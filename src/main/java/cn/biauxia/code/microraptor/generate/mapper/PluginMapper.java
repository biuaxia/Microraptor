package cn.biauxia.code.microraptor.generate.mapper;

import cn.biauxia.code.microraptor.generate.domain.Plugin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PluginMapper extends BaseMapper<Plugin> {
}