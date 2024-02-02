package se.payerl.groupmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.payerl.groupmanagement.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
