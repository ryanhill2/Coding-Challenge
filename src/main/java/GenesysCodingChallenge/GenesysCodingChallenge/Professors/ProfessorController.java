package GenesysCodingChallenge.GenesysCodingChallenge.Professors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> findAllProfessors(){
        return professorService.findAllProfessors();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor){ return professorService.createProfessor(professor);
    }


}
