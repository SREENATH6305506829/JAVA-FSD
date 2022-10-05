package com.ecommerce.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;   
@Repository
public class EProductDAO {
		@Autowired
        JdbcTemplate jdbctemplate;    
            
      
        
        public List<EProduct> getProducts(){    
            return jdbctemplate.query("select * from eproduct",new RowMapper<EProduct>(){    
                public EProduct mapRow(ResultSet rs, int row) throws SQLException {    
                        EProduct e=new EProduct();    
                    e.setId(rs.getLong(1));    
                    e.setName(rs.getString(2));    
                    e.setPrice(rs.getBigDecimal(3));    
                    e.setDateAdded(rs.getDate(4));    
                    return e;    
                }    
            });    
        }
}