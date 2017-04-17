package cn.blog.repository;

import cn.blog.model.Content;

import java.util.List;
import java.util.Map;

/**
 * Created by XIAOYAO on 2017/3/22/0022 by 15:03.
 * 文章操作
 */
public interface ContentRepository {

    /**
     * 保存文章信息
     *
     * @param content 文章信息
     * @return 执行结果
     */
    int saveContent(Content content);

    /**
     * 获取文章列表
     *
     * @return 文章列表
     */
    List<Map<String, Object>> findContent();
}
