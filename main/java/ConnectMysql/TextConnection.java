/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMysql;

/**
 *
 * @author HP
 */
public class TextConnection {
    public static void main(String[] args) {
        dbconnection dataAccess = new dbconnection();
        Connection connection = null;
        try{
            connection = dataAccess.getConnection();
            System.out.println("Connected my sql");
        }catch(SQLException e){
            System.err.println("can not connect my sql" + e.getMessage());
            
        }finally{
            dataAccess.closeConnection(connection);
            System.out.println("Connection í closed");
        }
    }
}
