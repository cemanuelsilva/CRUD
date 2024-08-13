package crud.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.app.rest.Models.User;


public interface UserRepo extends JpaRepository<User,Long>{



}
