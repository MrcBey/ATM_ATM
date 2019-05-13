package Entity_settings;

import org.springframework.data.repository.CrudRepository;

import Entity_settings.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}