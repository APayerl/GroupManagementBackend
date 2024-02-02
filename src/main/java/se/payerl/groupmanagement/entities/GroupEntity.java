package se.payerl.groupmanagement.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.Entity;
import se.payerl.groupmanagement.models.Group;

import java.util.UUID;

@Entity
@Table(name = "groups")
public class GroupEntity extends BaseEntity<Group> {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    private GroupEntity() {}

    @Autowired
    public GroupEntity(String name) {
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public GroupEntity setName(String name) {
        this.name = name;
        return this;
    }

    public GroupEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public Group toModel() {
        return new Group(this.name);
    }
}
