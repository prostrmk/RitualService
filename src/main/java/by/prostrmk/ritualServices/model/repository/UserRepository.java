package by.prostrmk.ritualServices.model.repository;

import by.prostrmk.ritualServices.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByUsername(String username);
    User findUserByMail(String mail);
    User findUserByMobilePhone(String mobilePhone);

}