
public class User {

    public static void main(String[] args) {
        User user = new User.UserBuilder(1).setName("Vazgen").setSurname("Khachatryan")
                .setEmail("vazgen90928@gmail.com").setPass("12345678a").build();
        System.out.println(user.toString());
    }

    private String name;
    private String surname;
    private String email;
    private String password;
    private int code;

    public static class UserBuilder {
        private String name;
        private String surname;
        private String email;
        private String password;
        private int code;

        UserBuilder(int code) {
            this.code = code;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPass(String password) {
            this.password = password;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }

    private User(UserBuilder builder) {
        name = builder.name;
        surname = builder.surname;
        email = builder.email;
        password = builder.password;
        code = builder.code;
    }


    @Override
    public String toString() {
        return "User: " + code + "\nname - " + name + "\nsurname - " + surname + "\nemail - " + email + "\npass: " +
                password;
    }
}



/* Написать Builder для класса User

public class User{

private String name;
private String surname;
private String email;
private String password;
private int code;

//....
}*/