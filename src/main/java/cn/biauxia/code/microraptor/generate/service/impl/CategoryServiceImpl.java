package cn.biauxia.code.microraptor.generate.service.impl;

import cn.biauxia.code.microraptor.generate.domain.Category;
import cn.biauxia.code.microraptor.generate.mapper.CategoryMapper;
import cn.biauxia.code.microraptor.generate.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
