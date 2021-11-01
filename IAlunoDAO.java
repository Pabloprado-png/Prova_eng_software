import java.util.List;

public interface IAlunoDAO {

 public List <Aluno> getAllAlunos();

 public void addAluno(Aluno aluno);

 public Aluno getAluno(int matricula);

 public void updateAluno(Aluno aluno);

 public void deleteAluno(Aluno aluno);

}