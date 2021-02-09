package GenesysCodingChallenge.GenesysCodingChallenge.Professors;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}