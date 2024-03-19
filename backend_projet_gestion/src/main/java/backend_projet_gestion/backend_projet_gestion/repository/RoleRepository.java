package backend_projet_gestion.backend_projet_gestion.repository;

import backend_projet_gestion.backend_projet_gestion.Models.ERole;
import backend_projet_gestion.backend_projet_gestion.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
