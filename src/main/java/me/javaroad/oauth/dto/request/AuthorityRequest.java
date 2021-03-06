package me.javaroad.oauth.dto.request;

import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author heyx
 */
@Getter
@Setter
public class AuthorityRequest {
    @NotBlank
    @Size(max = 50)
    private String name;
    private String description;
}
