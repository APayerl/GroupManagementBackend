package se.payerl.groupmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.payerl.groupmanagement.entities.GroupEntity;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<GroupEntity, UUID> {

}
