package cn.blog.repository.impl;

import cn.blog.model.Content;
import cn.blog.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by XIAOYAO on 2017/3/22/0022 by 15:07.
 */
@Repository
public class ContentRepositoryImpl implements ContentRepository {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public ContentRepositoryImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public int saveContent(Content content) {
        String sql = "insert into content(cid, createid, title, content) " +
                " values(:cid, :createid, :title, :content)";
        Map<String, Object> params = new HashMap<>();
        params.put("cid", content.getCid());
        params.put("createid", content.getCreateId());
        params.put("title", content.getTitle());
        params.put("content", content.getContent());
        return namedParameterJdbcTemplate.update(sql, params);
    }

    @Override
    public List<Map<String, Object>> findContent() {
        String sql = "select * from content";
        Map<String, Object> params = new HashMap<>();
        try {
            return namedParameterJdbcTemplate.queryForList(sql, params);
        } catch (DataAccessException e) {
            return null;
        }
    }
}
