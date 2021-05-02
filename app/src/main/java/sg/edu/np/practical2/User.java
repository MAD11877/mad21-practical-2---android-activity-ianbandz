package sg.edu.np.practical2;

public class User {
    String name;
    String description;
    int Id;
    Boolean followed;

    public User(String name, String description, int id, Boolean followed) {
        this.name = name;
        this.description = description;
        Id = id;
        this.followed = followed;
    }
}
