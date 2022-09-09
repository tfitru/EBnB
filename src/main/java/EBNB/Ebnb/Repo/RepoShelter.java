package EBNB.Ebnb.Repo;

import EBNB.Ebnb.models.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoShelter extends JpaRepository<Shelter, Integer> {
}
