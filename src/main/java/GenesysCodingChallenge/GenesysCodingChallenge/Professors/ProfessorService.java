package GenesysCodingChallenge.GenesysCodingChallenge.Professors;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> findAllProfessors(){
        return professorRepository.findAll();
    }

    public Professor createProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    public Professor getProfessorById(Long id){
        return professorRepository.getOne(id);
    }
}
