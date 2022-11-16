package cursos.curso02.unidade04.FuncionarioEscola;

//POLIMORFISMO
public abstract class Funcionario {
    public static void main(String[] args) {
        //Funcionario func = new Funcionario();
        //B é um objeto do tipo Funcionario sendo instanciado por new Professor
        Funcionario prof = new Professor();
        Funcionario dir = new Diretor();
        Funcionario adm = new Administrativo();
        //Usar Casting de Obejto para poder acessar
        //os atributos da classe diretor
        Funcionario objeto =  new Diretor();
        ((Diretor)objeto).departamento = "aaa";

        //S é do tipo funcionario mas é um objeto do tipo administrativo
        Funcionario s = new Administrativo();
        //Feito um casting para especificar que por mais
        //que S seja do tipo funcionario ela é um objeto do tipo Adminitrativo.
        Administrativo a = (Administrativo) s;

        dir.verificarTipoFuncionario(dir);
        prof.verificarTipoFuncionario(prof);
        adm.verificarTipoFuncionario(adm);
        //verificarTipoFuncionario(objeto); se fosse static void

       //CASTING DO TIPO PRIMITIVO
        char a1 = 'a';  float n = 2.5f;
        int t = 't';  int f = (a1 + 5);
        int d = (int)5.1987;
        char ch = (char) 110.5;

    }

    public abstract float getBonificacao();

    void verificarTipoFuncionario(Funcionario objeto){
        if (objeto instanceof Diretor){
            System.out.println("Objeto do tipo Diretor");
        } else if (objeto instanceof Professor) {
            System.out.println("Objeto do tipo Professor");
        } else if (objeto instanceof Administrativo) {
            System.out.println("Objeto do tipo Administrativo");
        }
    }


}
