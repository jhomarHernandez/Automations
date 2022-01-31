package starter.util.connectors;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

public class MySQLConnector {

    Logger log = Logger.getLogger(String.valueOf(MySQLConnector.class));

    String connectorUrl =
            "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3469282?allowPublicKeyRetrieval=true&serverTimezone=America/Lima&useSSL=false";

    public void connect(){
        try{
            File directoryProject = new File("./");
            Connection con = DriverManager.getConnection(connectorUrl, "sql3469282","W2qTEgQbu3");
            PreparedStatement ps = con.prepareStatement("select * from clientes");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long id = rs.getInt("ID");
                String name = rs.getString("Nombre");
                String lastName = rs.getString("Apellido");
                log.info("Nombre " + name);
                log.info("lastName " + lastName);
                System.out.println("Nombre " + name);
                System.out.println("lastName " + lastName);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
