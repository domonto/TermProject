package tr.edu.ieu.se360;

public class Creator {

    private String _id;
    private String name;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\nID: " + get_id() +
                "\nName : " + getName();

    }
}