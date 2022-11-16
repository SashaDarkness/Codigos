package cursos.curso03.unidade05.com.abc.treinamentos;

public class Cliente {
    String nome;
    String cpf;
    String email;

    public void cadastrar(){

    }

    public Cliente(String nome, String cpf, String email) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' ;
    }
}
