package cursos.curso02.unidade04.FuncionarioEscola;

public class Diretor extends Funcionario {
    public String departamento;

    @Override
    public float getBonificacao() {
        return 1900.0f;
    }
}
