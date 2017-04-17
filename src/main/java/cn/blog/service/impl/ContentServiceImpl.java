package cn.blog.service.impl;

import cn.blog.model.Content;
import cn.blog.repository.ContentRepository;
import cn.blog.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by XIAOYAO on 2017/3/22/0022 by 15:05.
 */
@Service
public class ContentServiceImpl implements ContentService {

    private ContentRepository contentRepository;

    @Autowired
    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public int saveContent(Content content) {
        return contentRepository.saveContent(content);
    }

    @Override
    public List<Map<String, Object>> findContent() {
        return contentRepository.findContent();
    }
}
