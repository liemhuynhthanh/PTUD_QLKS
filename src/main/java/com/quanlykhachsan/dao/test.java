/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanlykhachsan.dao;

import com.quanlykhachsan.model.ConnectDB;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class test {
    public static void main(String[] args) throws SQLException {
        ConnectDB con = new ConnectDB();
        con.connect();
        ThongKe_DAO a = new ThongKe_DAO();
        a.getList().forEach(x -> System.out.println(x));
    }
}
