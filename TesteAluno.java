import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
 public static void main(String[] args) {
 

  AlunoDAO alunoDao = new AlunoDAO();

  // a) Criando os alunos
  Aluno a1 = new Aluno("Pablo", 1110, "");
  Aluno a2 = new Aluno("Matheus", 1111, "");
  Aluno a3 = new Aluno("Victor", 1112, "");
  Aluno a4 = new Aluno("Josue", 1113, "");
  Aluno a5 = new Aluno("Daniel", 1114, "");

  // b) Inserindo os alunos na lista
  alunoDao.addAluno(a1);
  alunoDao.addAluno(a2);
  alunoDao.addAluno(a3);
  alunoDao.addAluno(a4);
  alunoDao.addAluno(a5);

  // c) Apresentacao da lista de alunos criados
  List<Aluno> aln = new ArrayList<Aluno>();
  aln = alunoDao.getAllAlunos();
  for (Aluno aluno : aln) {
   System.out.println(aluno.getNome() + "--" + aluno.getMatricula());
  }
System.out.println("------------------------------------------------------------------");
  // d) Remocao de alunos da lista
  alunoDao.deleteAluno(a2);
  aln = alunoDao.getAllAlunos();
  for (Aluno aluno : aln) {
   System.out.println(aluno.getNome() + "--" + aluno.getMatricula());
  }
 }
}