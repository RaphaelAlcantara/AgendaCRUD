//DataBase Connection

package model;

import java.sql.Connection;

public class DAO {
    /*DataBase Connection*/

    //parametros de conexão
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url =
            "jdbc:mysql://localhost:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "Dba@12345";

    //metodo de conexão
    private Connection conectar() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = java.sql.DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return connection;
    }

/*    metodo de testar conexão
    public void testeConexao(){
        try {
            Connection connection = conectar();
            System.out.println(connection);
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
*/
    }

