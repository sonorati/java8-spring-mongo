package photo.domain;

import org.springframework.data.annotation.Id;

public class Region {

    @Id
    private String id;

    private String name;

    public Region(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                '}';
    }
}
