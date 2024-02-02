package se.payerl.groupmanagement.apis;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.payerl.groupmanagement.entities.GroupEntity;
import se.payerl.groupmanagement.models.Group;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/group")
public interface GroupApi {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    ResponseEntity<List<GroupEntity>> getAllGroups();

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    ResponseEntity<GroupEntity> getGroupById(@PathVariable UUID id);

    @RequestMapping(path = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<GroupEntity> addNewGroup(@RequestBody(required = true) Group group);
}
