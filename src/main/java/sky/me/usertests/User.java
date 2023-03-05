package sky.me.usertests;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = validateLogin(login);
        this.email = validateEmail(email);
    }

    public User() {
    }

    public String validateLogin(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Неверно заполненно поле Логин");
        } else {
            return value;
        }
    }

    public String validateEmail(String value) {
        if (value == null || value.isEmpty() || value.isBlank() || !value.contains("@") || !value.contains(".")) {
            throw new IllegalArgumentException("Неверно заполненно поле E-mail");
        }
        if (value.equals(login)) {
            throw new IllegalArgumentException("Поля E-mail и Логин совподают");
        } else {
            return value;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
