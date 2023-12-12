package com.example.testfotmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;


@SpringBootTest
class TestfotmvcApplicationTests {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	void contextLoads() {
	}
	@Test
	void testStatementCallback() {
		jdbcTemplate.execute((Statement stmt) -> {
			String sql = "insert into category(id, name, root, parent_id) values (1, 'Java EE', 1, null)";
			return stmt.executeUpdate(sql);
		});
	}
	@Test
	void testPreparedStatementCallback() {
		jdbcTemplate.execute((Connection conn) -> {
			String sql = "insert into category(id, name, root, parent_id) values (?, ?, ?, ?)";
			return conn.prepareStatement(sql);
		}, (PreparedStatement ps) -> {
			ps.setInt(1, 2);
			ps.setString(2, "程序设计");
			ps.setBoolean(3, true);
			ps.setNull(4, Types.NULL);
			return ps.executeUpdate();
		});
	}

}
