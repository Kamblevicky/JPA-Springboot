/*
 * package com.project.database.databaseDemo;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException; import
 * java.sql.Timestamp; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.BeanPropertyRowMapper; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.RowMapper; import
 * org.springframework.stereotype.Repository;
 * 
 * @Repository public class PersonJdbcDao {
 * 
 * @Autowired JdbcTemplate jdbcTemplate;
 * 
 * class VivekPersonRowMapper implements RowMapper<VivekPerson> {
 * 
 * @Override public VivekPerson mapRow(ResultSet rs, int rowNum) throws
 * SQLException {
 * 
 * VivekPerson vivekperson = new VivekPerson();
 * vivekperson.setId(rs.getInt("id"));
 * vivekperson.setName(rs.getString("name"));
 * vivekperson.setLocation(rs.getString("location"));
 * vivekperson.setBirthDate(rs.getTimestamp("birth_date")); return vivekperson;
 * }
 * 
 * }
 * 
 * public List<VivekPerson> findAll() { return
 * jdbcTemplate.query("select * from vivek_person", new
 * BeanPropertyRowMapper(VivekPerson.class)); }
 * 
 * public VivekPerson findById(int id) { return
 * jdbcTemplate.queryForObject("select * from vivek_person where id=?", new
 * Object[] { id }, new BeanPropertyRowMapper<VivekPerson>(VivekPerson.class));
 * }
 * 
 * public int deleteById(int id) { return
 * jdbcTemplate.update("delete from vivek_person where id =?", new Object[] { id
 * }); }
 * 
 * public int insert(VivekPerson vivek_person) { return
 * jdbcTemplate.update("insert into vivek_person (id,name,location,birth_date)"
 * + "values(?,?,?,?)", new Object[] { vivek_person.getId(),
 * vivek_person.getName(), vivek_person.getLocation(), new
 * Timestamp(vivek_person.getBirthDate().getTime()) });
 * 
 * }
 * 
 * public int update(VivekPerson vivek_person) { return jdbcTemplate.update(
 * "update vivek_person " + " set name = ?, location = ?, birth_Date = ? " +
 * " where id = ?", new Object[] { vivek_person.getName(),
 * vivek_person.getLocation(), new
 * Timestamp(vivek_person.getBirthDate().getTime()), vivek_person.getId() }); }
 * 
 * public int update(VivekPerson vivek_person) { return jdbcTemplate.update(
 * "update vivek_person " + " set name = ?, location = ?, birth_date = ?" +
 * "where id = ?", new Object[] { vivek_person.getName(),
 * vivek_person.getLocation(), new
 * Timestamp(vivek_person.getBirthDate().getTime()), vivek_person.getId() }); }
 * 
 * }
 */