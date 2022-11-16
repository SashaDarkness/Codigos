package cursos.curso02.unidade04.FuncionarioEscola;

public class Professor extends Funcionario implements Cidadao, Autenticavel, Contribuinte {
    @Override
    public float getBonificacao() {
        return 1500.0f;
    }

    @Override
    public void pagaIR() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean autentica(String senha) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void vota() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getRg() {
        // TODO Auto-generated method stub
        return null;
    }
}
