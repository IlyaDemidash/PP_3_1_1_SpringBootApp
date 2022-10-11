package net.ilya.springbootapp.UserRepo;

import net.ilya.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
