package Regex.SystemRegistration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Data
@AllArgsConstructor
public class RegistrationField {
    private String name;
    private String password;
}
