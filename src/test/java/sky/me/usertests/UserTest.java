package sky.me.usertests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserTest {
    private static final String TRUE_LOGIN = "Login";
    private static final String LOGIN_EMPTY = "";
    private static final String TRUE_EMAIL = "email@mail.ru";
    private static final String FALLS_EMAIL_WITHOUT_AT = "emailmail.ru";
    private static final String FALLS_EMAIL_WITHOUT_DOT = "email@mailru";

    @Test
    public void shouldCreateUserObjectWithTwoParameters(){
        User result = new User(TRUE_LOGIN, TRUE_EMAIL);
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldCreateUserObjectWithNoParameters(){
        User result = new User();
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldEmailContainsAtAndDot(){
        User result1 = new User(TRUE_LOGIN, FALLS_EMAIL_WITHOUT_AT);
        User result2 = new User(TRUE_LOGIN, FALLS_EMAIL_WITHOUT_DOT);
        User result3 = new User(TRUE_LOGIN, TRUE_EMAIL);
        Assertions.assertFalse(result1.getEmail().contains("@"));
        Assertions.assertFalse(result2.getEmail().contains("."));
        Assertions.assertTrue(result3.getEmail().contains("@")
                && result3.getEmail().contains("."));
    }
    @Test
    public  void shouldNotBeEqualLoginAndEmail(){
        User result = new User(TRUE_LOGIN, TRUE_EMAIL);
        Assertions.assertNotEquals(result.getLogin(), result.getEmail());
    }
    @Test
    public void expectedLoginException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            User result1 = new User(LOGIN_EMPTY, TRUE_EMAIL);
        });
    }
}