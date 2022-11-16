package cursos.curso03.unidade02;

public interface Internet {
    /*conectar @deprecated
    * usar conectar SSL*/
    @Deprecated
    public void conectar();
    public void conectarSSL();

}

