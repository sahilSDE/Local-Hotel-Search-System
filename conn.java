
package hotel.management.system;
import java.sql.*;
public class conn {

    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cp","root","Sahil@15");
            Statement st = c.createStatement();
            String url = "INSERT INTO `user`(`First_name`, `Last_name`, `Address`, `Gender`, `Email`, Phone`, `Username`, `Password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            Statement st2 = c.createStatement();
            //String updt = "update Stu_info set Name = 'Kuldip' where roll_num = '32'";
            System.out.println("Data inserted");
            st.executeUpdate(url);
            //st.executeUpdate(updt);
         
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}