package cn.biauxia.code.microraptor.generate.mapper;

import cn.biauxia.code.microraptor.generate.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}