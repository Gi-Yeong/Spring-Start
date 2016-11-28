package com.hb.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDB {
    private static Connection conn;
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String user = "scott";
    private static String password = "tiger";

    public static Connection getConn() throws Exception {
        if (conn == null || conn.isClosed()) {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);
        }
        return conn;
    }
}
