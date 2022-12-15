import controller.UserLoginController;
import model.UserLoginModel;
import view.UserLoginview;

import java.sql.SQLException;
public class UserLoginMain {

    public static void main(String[] args) throws SQLException {
        UserLoginModel user = new UserLoginModel();
        UserLoginview view = new UserLoginview(user);
        UserLoginController controller = new UserLoginController(user, view);

    }
}
