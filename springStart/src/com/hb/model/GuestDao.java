package com.hb.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {
    private final Connection conn;
    private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String user = "scott";
    private final String password = "tiger";
    private PreparedStatement pstmt;
    private ResultSet rs;

    public GuestDao() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        conn = DriverManager.getConnection(url, user, password);
    }

    public List selectAll() {
        String sql = "SELECT * FROM GUEST";
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<GuestVo> list = new ArrayList<>();
            while (rs.next()){
                list.add(new GuestVo(rs.getInt("sabun")
                , rs.getString("name")
                , rs.getDate("nalja")
                , rs.getInt("pay")));
            }
            return list;
        } catch (SQLException e) {
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
}
