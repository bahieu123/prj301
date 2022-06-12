/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Nhat Anh
 */
public class DAO extends DBContext{
    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from Student";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student c = new Student();
                c.setRollNo(rs.getString("RollNo"));
                c.setCode(rs.getString("Code"));
                c.setName(rs.getString("Name"));
                c.setGender(rs.getInt("Gender"));
                c.setBirth_Day(rs.getDate("Birth_Day"));
                c.setEmail(rs.getString("Email"));
                c.setMobilePhone(rs.getString("MobilePhone"));
                list.add(c);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    // inser
    
    public void insert(Student c){
        String sql="INSERT INTO [dbo].[Student]\n" +
"           ([RollNo]\n" +
"           ,[Code]\n" +
"           ,[Name]\n" +
"           ,[Gender]\n" +
"           ,[Birth_Day]\n" +
"           ,[Email]\n" +
"           ,[MobilePhone])\n" +
"            VALUES\n" +
"           (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1,c.getRollNo());
            st.setString(2,c.getCode());
            st.setString(3, c.getName());
            st.setInt(4,c.getGender());
            st.setDate(5,c.getBirth_Day());
            st.setString(6, c.getEmail());
            st.setString(7, c.getMobilePhone());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void delete(String code){
        String sql="DELETE FROM [dbo].[Student]\n" +
"      WHERE Code=?";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, code);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
         DAO dao = new DAO();
    List<Student> list = new ArrayList<>();
     list = dao.getAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
