package com.controller;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.dao.ProductDaoImpl;
import com.dao.ProductDaoInterface;
@Configurable

public class AppConfig {
	@Bean
	public DriverManagerDataSource getDataManagerDataSource() 
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@LocalHost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
		
	}
	
	@Bean(name="jt")
	public JdbcTemplate getJdbcTemplet() {
		JdbcTemplate ref=new JdbcTemplate();
		ref.setDataSource(getDataManagerDataSource());
		return ref;
		
		
	}

	@Bean(name="pdao")
	public ProductDaoInterface getProductDaoImpl() {
		 ProductDaoInterface pdao=new ProductDaoImpl() ;
		return pdao;
	}
}
