package org.prince.formsubmission.Repo;

import org.prince.formsubmission.Model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserData, Long> {
}
