
import java.io.Serializable;

public class Player implements Serializable{
    private String name;
    private String lastName;
    private String id;
    private String user;
    private int victories;
    
    public Player(){}

    public Player(String name, String lastName, String id, String user) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
