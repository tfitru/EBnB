package EBNB.Ebnb.Repo;

import EBNB.Ebnb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUser extends JpaRepository<User, Integer> {
}
