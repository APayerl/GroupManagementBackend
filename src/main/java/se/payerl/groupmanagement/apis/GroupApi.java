package se.payerl.groupmanagement.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.payerl.groupmanagement.models.Group;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public interface GroupApi {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    ResponseEntity<List<Group>> getAllGroups();
}
