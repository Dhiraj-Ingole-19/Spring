package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Product;

public class ProductDaoImpl implements ProductDaoInterface {
    private JdbcTemplate jt;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public int saveProduct(Product p) {
        String query = "INSERT INTO products1 (pid, pname, pqty, pprice) VALUES (?, ?, ?, ?)";
        return jt.update(query, p.getPid(), p.getPname(), p.getQuantity(), p.getPrice());
    }

    @Override
    public int updateProduct(Product p) {
        String query = "UPDATE products1 SET pname = ?, pprice = ?, pqty = ? WHERE pid = ?";
        return jt.update(query, p.getPname(), p.getPrice(), p.getQuantity(), p.getPid());
    }

    @Override
    public int deleteProduct(Product p) {
        String query = "DELETE FROM products1 WHERE pid = ?";
        return jt.update(query, p.getPid());
    }

    @Override
    public void showProductById(int pid) {
        String query = "SELECT pid, pname, pqty, pprice FROM products1 WHERE pid = ?";
        try {
            Product product = jt.queryForObject(query, new RowMapper<Product>() {
                @Override
                public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Product p = new Product();
                    p.setPid(rs.getInt("pid"));
                    p.setPname(rs.getString("pname"));
                    p.setQuantity(rs.getInt("pqty"));
                    p.setPrice(rs.getDouble("pprice"));
                    return p;
                }
            }, pid);
            product.display();
        } catch (Exception e) {
            System.out.println("Product not found with ID: " + pid);
        }
    }

    @Override
    public void showProduct() {
        String query = "SELECT pid, pname, pqty, pprice FROM products1 ORDER BY pid";
        try {
            List<Product> productList = jt.query(query, new RowMapper<Product>() {
                @Override
                public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Product p = new Product();
                    p.setPid(rs.getInt("pid"));
                    p.setPname(rs.getString("pname"));
                    p.setQuantity(rs.getInt("pqty"));
                    p.setPrice(rs.getDouble("pprice"));
                    return p;
                }
            });

            ArrayList<Product> productArrayList = new ArrayList<>(productList);
            for (Product p : productArrayList) {
                p.display();
            }
        } catch (Exception e) {
            System.out.println("Error retrieving products: " + e.getMessage());
        }
    }
}
