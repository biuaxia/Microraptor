package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Article;
import cn.biauxia.code.microraptor.generate.mapper.ArticleMapper;
import cn.biauxia.code.microraptor.generate.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
