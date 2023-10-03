package BookMap.PentaRim.User.model;


import BookMap.PentaRim.User.Role;
import jakarta.persistence.*;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User extends TimeEntity {


    private String provider;
    @NotBlank
    @Column(unique = true)
    private String providerId;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String email;
    private String picture;
    private String book_state;

    @NotBlank
    @Column(unique = true)
    private String username;
    private String nickname;

    @NotBlank
    @Column(unique = true)
    private HttpSession session;

    private Role role;
}

