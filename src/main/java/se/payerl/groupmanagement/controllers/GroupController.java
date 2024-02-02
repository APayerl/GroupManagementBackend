package se.payerl.groupmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import se.payerl.groupmanagement.apis.GroupApi;
import se.payerl.groupmanagement.entities.GroupEntity;
import se.payerl.groupmanagement.models.Group;
import se.payerl.groupmanagement.repositories.GroupRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
public class GroupController implements GroupApi {
    GroupRepository groupRepository;

    @Autowired
    public GroupController(@Autowired GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public ResponseEntity<List<GroupEntity>> getAllGroups() {
        return ResponseEntity.status(HttpStatus.OK).body(this.groupRepository.findAll());
    }

    @Override
    public ResponseEntity<GroupEntity> getGroupById(UUID id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.groupRepository.findById(id).orElseThrow());
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @Override
    public ResponseEntity<GroupEntity> addNewGroup(Group group) {
        return ResponseEntity.status(HttpStatus.OK).body(this.groupRepository.save(group.toEntity()));
    }
}
