package se.payerl.groupmanagement.models;

import se.payerl.groupmanagement.entities.GroupEntity;

public class Group extends BaseModel<GroupEntity> {
    private String name;

    private Group() {}
    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public GroupEntity toEntity() {
        return new GroupEntity(this.name);
    }
}
