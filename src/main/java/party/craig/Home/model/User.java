package party.craig.Home.model;

import liquibase.pro.packaged.S;
import lombok.Data;

@Data
public class User {

    private long id;
    private String username;
    private String firstName;
    private String lastName;

    public User(long id, String username, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(long id, String username) {
        this.id = id;
        this.username = username;
    }
}
