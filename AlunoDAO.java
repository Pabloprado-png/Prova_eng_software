import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements IAluno {
 private List <Aluno> alunos = new ArrayList<>();

 public List<Aluno> getAllAlunos() {
  return alunos;
 }

 public void addAluno(Aluno aluno) {
  alunos.add(aluno);
 }


 public Aluno getAluno(int matricula) {
  for (Aluno aluno : alunos) {
   if (aluno.getMatricula() == matricula) {
    return aluno;
   }
  }
  return null;
 }

 public void updateAluno(Aluno aluno) {
  alunos.get(aluno.getMatricula()).setNome(aluno.getNome());
  alunos.get(aluno.getMatricula()).setEmail(aluno.getEmail());
  System.out.println("Aluno com  a matrícula." + aluno.getMatricula() + ", atualizado.");
 }

 public void deleteAluno(Aluno aluno) {
  alunos.remove(getAluno(aluno.getMatricula()));
 }
 
}
