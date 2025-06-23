
package com.shadsluiter.eventsapp.repositories;

import com.shadsluiter.eventsapp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryInterface extends JpaRepository<UserModel, Long> {
}
