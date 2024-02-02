package se.payerl.groupmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import se.payerl.groupmanagement.apis.GroupApi;
import se.payerl.groupmanagement.models.Group;
import se.payerl.groupmanagement.repositories.GroupRepository;

import java.util.List;

@RestController
public class GroupController implements GroupApi {
    GroupRepository groupRepository;

    @Autowired
    public GroupController(@Autowired GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public ResponseEntity<List<Group>> getAllGroups() {
        return ResponseEntity.status(HttpStatus.OK).body(this.groupRepository.findAll());
    }
}
