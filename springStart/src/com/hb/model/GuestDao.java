package com.hb.model;

import com.hb.util.OraDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Connection conn;

    public GuestDao() {

    }

    public List selectAll() {
        String sql = "SELECT * FROM GUEST";
        try {
            conn = OraDB.getConn();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<GuestVo> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new GuestVo(rs.getInt("sabun")
                        , rs.getString("name")
                        , rs.getDate("nalja")
                        , rs.getInt("pay")));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void insertOne(GuestVo bean) {
        String sql = "INSERT INTO GUEST VALUES (?, ?, sysdate, ?)";
        try {
            conn = OraDB.getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bean.getSabun());
            pstmt.setString(2, bean.getName());
            pstmt.setInt(3, bean.getPay());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
