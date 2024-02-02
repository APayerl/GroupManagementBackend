package se.payerl.groupmanagement.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.Entity;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    private Group() {}

    @Autowired
    public Group(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public Group setId(String id) {
        this.id = id;
        return this;
    }
}
