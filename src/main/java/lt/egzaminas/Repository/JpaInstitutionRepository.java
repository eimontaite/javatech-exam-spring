package lt.egzaminas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.egzaminas.Model.Institution.Institution;

public interface JpaInstitutionRepository extends JpaRepository<Institution, Long> {
}
