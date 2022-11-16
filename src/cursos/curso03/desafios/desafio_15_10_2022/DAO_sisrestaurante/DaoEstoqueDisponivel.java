package cursos.curso03.desafios.desafio_15_10_2022.DAO_sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class DaoEstoqueDisponivel extends DaoCardapio {
        private static final List<DaoEstoqueDisponivel> estoquePratosPromocionais = new ArrayList<>();
        private static final List<DaoEstoqueDisponivel> estoquePratosEntrada = new ArrayList<>();
        private static final List<DaoEstoqueDisponivel> estoquePratosTemakiEspecial = new ArrayList<>();
        private static final List<DaoEstoqueDisponivel> estoquePratosHollWassabi = new ArrayList<>();

        /*** PRATOS DE PROMOCIONAIS -> 5 PRATOS ***/
        static {
                estoquePratosPromocionais.add(new DaoEstoqueDisponivel(
                                "Combo Promo 01 (15 Peças)",
                                49.90,
                                "10 Hol De Salmão Grelhado Com Batata Palha Doce, 3 Niguiris De Skin..."));

                estoquePratosPromocionais.add(new DaoEstoqueDisponivel(
                                "Combo Promo 02 (15 Peças)",
                                53.90,
                                "4 Sashimi De Salmão, 2 Guinkas Maçarico Com Molho De Manga,..."));

                estoquePratosPromocionais.add(new DaoEstoqueDisponivel(
                                "Combo Promo 03 (15 Peças)",
                                49.90,
                                "5 Makimono Skin Com Pesto De Jambu, 5 Hot De Kani Com Pate De..."));

                estoquePratosPromocionais.add(new DaoEstoqueDisponivel(
                                "Combo Promo 04 (15 Peças)",
                                48.50,
                                "5 Gunkan Com Patê De Polvo, Apimentado 2 Niguiris De Kani 2 Ni..."));

                estoquePratosPromocionais.add(new DaoEstoqueDisponivel(
                                "Promo Vegano (15 PEÇAS)",
                                40.90,
                                "5 Makimono De Shimeji Com Palha De Couve, 5 Hot Manga Com Pipino..."));
        }

        /*** PRATOS DE ENTRADA -> 5 PRATOS ***/
        static {
                estoquePratosEntrada.add(new DaoEstoqueDisponivel(
                                "Salmão em Consumer",
                                39.0,
                                "Salmão em Consumer com base de purê de Batata doce"));

                estoquePratosEntrada.add(new DaoEstoqueDisponivel(
                                "Lula em Anéis Grelhada",
                                41.0,
                                "Anéis de lula grelhada em fogo Brando com farofa de polvo"));

                estoquePratosEntrada.add(new DaoEstoqueDisponivel(
                                "Bolinha de Salmão Fritas",
                                28.0,
                                "10 unidades de Salmão temperado com limão e cebolinha, empanadas..."));

                estoquePratosEntrada.add(new DaoEstoqueDisponivel(
                                "Camarão Empanado (5 unidades)",
                                43.50,
                                "Camarão empanado frito..."));

                estoquePratosEntrada.add(new DaoEstoqueDisponivel(
                                "Guioza (5 unidades)",
                                32.00,
                                "Pastel oriental de carne. Podendo ser frita ou a vapor..."));
        }

        /*** PRATOS DE TEMAKI ESPECIAL -> 5 PRATOS ***/
        static {
                estoquePratosTemakiEspecial.add(new DaoEstoqueDisponivel(
                                "Temaki Exotic",
                                41.50,
                                "Salmão, Kani, Shimeji Fritos na Manteiga e Cream Cheese, arroz e algas..."));

                estoquePratosTemakiEspecial.add(new DaoEstoqueDisponivel(
                                "Temaki Poró",
                                42.50,
                                "Salmão misturado com Alho poró na casquinha de massa Harumaki, arroz..."));

                estoquePratosTemakiEspecial.add(new DaoEstoqueDisponivel(
                                "Temaki Salmão Especial",
                                43.50,
                                "Salmão Grelhado na casquinha de massa Harumaki, Cream Cheese, arroz.."));

                estoquePratosTemakiEspecial.add(new DaoEstoqueDisponivel(
                                "Temaki Super Wasabi",
                                45.50,
                                "Salmão, Camarão e Kani na massa Harumaki com Cream Cheese, arroz e cebolinha."));

                estoquePratosTemakiEspecial.add(new DaoEstoqueDisponivel(
                                "Temaki Wasabi",
                                46.50,
                                "Salmão Grelhado, Camarão, Cream Cheese, arroz, alga nori e cebolinha."));

        }

        /*** PRATOS DE HOLL WASSABI -> 5 PRATOS ***/
        static {
                estoquePratosHollWassabi.add(new DaoEstoqueDisponivel(
                                "Wassabi Hol Met",
                                23.50,
                                "5 peças do holl de salmão gerlhado, cream cheese, alga nori, arroz, gergilim e biscoitinho tempurá"));

                estoquePratosHollWassabi.add(new DaoEstoqueDisponivel(
                                "Holl Tartar de Salmão Met",
                                24.50,
                                "5 peças de holl de salmão, arroz, gergelim, alga nori, cream cheese, a parte de salmão em cima"));

                estoquePratosHollWassabi.add(new DaoEstoqueDisponivel(
                                "Holl Tartar de Salmão",
                                46.50,
                                ""));

                estoquePratosHollWassabi.add(new DaoEstoqueDisponivel(
                                "Kasai Met",
                                23.50,
                                ""));

                estoquePratosHollWassabi.add(new DaoEstoqueDisponivel(
                                "Kasai",
                                47.50,
                                ""));

        }

        public DaoEstoqueDisponivel(String nomeCardapio, double precoCardapio, String descricaoCardapio) {
                super(nomeCardapio, precoCardapio, descricaoCardapio);
        }

        public DaoEstoqueDisponivel() {
        }

        public static List<DaoEstoqueDisponivel> getEstoquePratosPromocionais() {
                return estoquePratosPromocionais;
        }

        public static List<DaoEstoqueDisponivel> getEstoquePratosEntrada() {
                return estoquePratosEntrada;
        }

        public static List<DaoEstoqueDisponivel> getEstoquePratosTemakiEspecial() {
                return estoquePratosTemakiEspecial;
        }

        public static List<DaoEstoqueDisponivel> getEstoquePratosHollWassabi() {
                return estoquePratosHollWassabi;
        }

}
