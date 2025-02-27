package nextstep.dto.auth;


import java.util.Objects;
import java.util.function.Predicate;

public class TokenRequest {
    private String username;
    private String password;

    /* RestAssured에서 사용 */
    @SuppressWarnings("unused")
    public TokenRequest() {
    }

    public TokenRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isNotValid() {
        return isNull(username) || isNull(password);
    }

    private <T> boolean isNull(T value) {
        Predicate<T> nullPredicate = Objects::isNull;
        return nullPredicate.test(value);
    }
}
