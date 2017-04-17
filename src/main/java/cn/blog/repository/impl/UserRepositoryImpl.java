package cn.blog.repository.impl;

import cn.blog.model.User;
import cn.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
* @Coder XIAOYAO
* @Time 2016年4月21日 下午11:01:23
*
*/
@Repository
public class UserRepositoryImpl implements UserRepository {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public UserRepositoryImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	@Override
	public int save(User user) {
		Map<String, Object> params = new HashMap<>();
		params.put("username", user.getUsername());
		params.put("password", user.getPassword());
		String sql = "insert into `user`(username, password) values(:username,:password)";
		return namedParameterJdbcTemplate.update(sql, params);
	}

	@Override
	public User getUser(String username, String password) {
		String sql = "select * from `user` where username=:username and password=:password";
		Map<String, String> params = new HashMap<>();
		params.put("username", username);
		params.put("password", password);
		try {
			return namedParameterJdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<>(User.class));
		} catch (DataAccessException e) {
			return null;
		}
	}

}
