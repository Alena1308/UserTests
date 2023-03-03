package sky.me.usertests;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class User {
    @NotBlank
    @NotEmpty
    @NotNull
    private String login;
    @NotBlank
    @NotEmpty
    @NotNull
    private String email;
}
