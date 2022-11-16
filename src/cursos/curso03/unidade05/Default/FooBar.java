package cursos.curso03.unidade05.Default;

public class FooBar implements Foo, Bar {
    @Override  //sobrescreve o método e anula o método do Bar e pega o do Foo
    public void talk() {
        Foo.super.talk();
    }
}
