package Regex.SystemRegistration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private int id;
    private String name;
    private String surname;
    private String DateOfBirth;
}
