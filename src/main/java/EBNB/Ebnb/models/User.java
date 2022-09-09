package EBNB.Ebnb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String phoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
