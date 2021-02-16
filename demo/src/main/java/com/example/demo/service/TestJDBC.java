package com.example.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/network?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true",
                    "root", "root");
            try (Statement statement = connection.createStatement()) {
              String sql1 = "select * from userinfo";
              statement.execute(sql1);
            }
            System.out.println("加载驱动成功");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
