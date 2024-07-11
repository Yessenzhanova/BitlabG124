package interf;

public class UserBeanImp implements UserBean {

    User[] users;

    public UserBeanImp() {
    }

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length ; i++){
            System.out.println(users[i]);
        }

    }

    @Override
    public void getUsersByName(String name) {

    }

    @Override
    public void getUsersBySurname(String surname) {
    }

    }

