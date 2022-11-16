package cursos.curso02.unidade04.FuncionarioEscola;

public class Escola {

    public static void main(String[] args) {
        Funcionario joao = new Professor();
        Funcionario andre = new Diretor();
        Funcionario josue = new Administrativo();

        System.out.println(tipoDoFuncionario(joao));
        System.out.println(tipoDoFuncionario(josue));
        System.out.println(tipoDoFuncionario(andre));

        Funcionario thyago = new Diretor();

        ((Diretor)thyago).departamento = "Testing";

        System.out.println(((Diretor)thyago).departamento);

        Professor professor = new Professor();

        Autenticavel autenticavel = professor;
        Contribuinte contribuinte = professor;
        Cidadao cidadao = professor;

        System.out.println(autenticavel);
        System.out.println(contribuinte);
        System.out.println(cidadao);
    }

    public static String tipoDoFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Professor) {
            return "Professor";
        } else if (funcionario instanceof Diretor) {
            return "Diretor";
        } else if (funcionario instanceof Administrativo) {
            return "Administrativo";
        }

        return "Indefinido";
    }
}