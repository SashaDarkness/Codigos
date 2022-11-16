package cursos.curso03.unidade05;


public class Conversao {
    public static void main(String[] args) {
        Something something = new Something();

        Converter<String, String> converter = something::startWith;

        String converted = converter.convert("java");
        System.out.println(converted);


        Converter<String, Integer> converter1 = (from) -> Integer.valueOf(from);

        //substituição Converter<F, T>
        //Converter<String, String> converter2 = Integer::valueOf;
    }
}
