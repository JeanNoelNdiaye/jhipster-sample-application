package sn.ssi.sygmap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ssi.sygmap.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
