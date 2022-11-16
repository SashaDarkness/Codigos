package cursos.curso02.DesafioAvaliativo.desafio02.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDisponivel extends Cardapio {
        private static final List<EstoqueDisponivel> estoquePratosPromocionais = new ArrayList<>();
        private static final List<EstoqueDisponivel> estoquePratosEntrada = new ArrayList<>();
        private static final List<EstoqueDisponivel> estoquePratosTemakiEspecial = new ArrayList<>();
        private static final List<EstoqueDisponivel> estoquePratosHollWassabi = new ArrayList<>();

        /*** PRATOS DE PROMOCIONAIS -> 5 PRATOS ***/
        static {
                estoquePratosPromocionais.add(new EstoqueDisponivel(
                                "Combo Promo 01 (15 Peças)",
                                49.90,
                                "10 Hol De Salmão Grelhado Com Batata Palha Doce, 3 Niguiris De Skin..."));

                estoquePratosPromocionais.add(new EstoqueDisponivel(
                                "Combo Promo 02 (15 Peças)",
                                53.90,
                                "4 Sashimi De Salmão, 2 Guinkas Maçarico Com Molho De Manga,..."));

                estoquePratosPromocionais.add(new EstoqueDisponivel(
                                "Combo Promo 03 (15 Peças)",
                                49.90,
                                "5 Makimono Skin Com Pesto De Jambu, 5 Hot De Kani Com Pate De..."));

                estoquePratosPromocionais.add(new EstoqueDisponivel(
                                "Combo Promo 04 (15 Peças)",
                                48.50,
                                "5 Gunkan Com Patê De Polvo, Apimentado 2 Niguiris De Kani 2 Ni..."));

                estoquePratosPromocionais.add(new EstoqueDisponivel(
                                "Promo Vegano (15 PEÇAS)",
                                40.90,
                                "5 Makimono De Shimeji Com Palha De Couve, 5 Hot Manga Com Pipino..."));
        }

        /*** PRATOS DE ENTRADA -> 5 PRATOS ***/
        static {
                estoquePratosEntrada.add(new EstoqueDisponivel(
                                "Salmão em Consumer",
                                39.0,
                                "Salmão em Consumer com base de purê de Batata doce"));

                estoquePratosEntrada.add(new EstoqueDisponivel(
                                "Lula em Anéis Grelhada",
                                41.0,
                                "Anéis de lula grelhada em fogo Brando com farofa de polvo"));

                estoquePratosEntrada.add(new EstoqueDisponivel(
                                "Bolinha de Salmão Fritas",
                                28.0,
                                "10 unidades de Salmão temperado com limão e cebolinha, empanadas..."));

                estoquePratosEntrada.add(new EstoqueDisponivel(
                                "Camarão Empanado (5 unidades)",
                                43.50,
                                "Camarão empanado frito..."));

                estoquePratosEntrada.add(new EstoqueDisponivel(
                                "Guioza (5 unidades)",
                                32.00,
                                "Pastel oriental de carne. Podendo ser frita ou a vapor..."));
        }

        /*** PRATOS DE TEMAKI ESPECIAL -> 5 PRATOS ***/
        static {
                estoquePratosTemakiEspecial.add(new EstoqueDisponivel(
                                "Temaki Exotic",
                                41.50,
                                "Salmão, Kani, Shimeji Fritos na Manteiga e Cream Cheese, arroz e algas..."));

                estoquePratosTemakiEspecial.add(new EstoqueDisponivel(
                                "Temaki Poró",
                                42.50,
                                "Salmão misturado com Alho poró na casquinha de massa Harumaki, arroz..."));

                estoquePratosTemakiEspecial.add(new EstoqueDisponivel(
                                "Temaki Salmão Especial",
                                43.50,
                                "Salmão Grelhado na casquinha de massa Harumaki, Cream Cheese, arroz.."));

                estoquePratosTemakiEspecial.add(new EstoqueDisponivel(
                                "Temaki Super Wasabi",
                                45.50,
                                "Salmão, Camarão e Kani na massa Harumaki com Cream Cheese, arroz e cebolinha."));

                estoquePratosTemakiEspecial.add(new EstoqueDisponivel(
                                "Temaki Wasabi",
                                46.50,
                                "Salmão Grelhado, Camarão, Cream Cheese, arroz, alga nori e cebolinha."));

        }

        /*** PRATOS DE HOLL WASSABI -> 5 PRATOS ***/
        static {
                estoquePratosHollWassabi.add(new EstoqueDisponivel(
                                "Wassabi Hol Met",
                                23.50,
                                "5 peças do holl de salmão gerlhado, cream cheese, alga nori, arroz, gergilim e biscoitinho tempurá"));

                estoquePratosHollWassabi.add(new EstoqueDisponivel(
                                "Holl Tartar de Salmão Met",
                                24.50,
                                "5 peças de holl de salmão, arroz, gergelim, alga nori, cream cheese, a parte de salmão em cima"));

                estoquePratosHollWassabi.add(new EstoqueDisponivel(
                                "Holl Tartar de Salmão",
                                46.50,
                                ""));

                estoquePratosHollWassabi.add(new EstoqueDisponivel(
                                "Kasai Met",
                                23.50,
                                ""));

                estoquePratosHollWassabi.add(new EstoqueDisponivel(
                                "Kasai",
                                47.50,
                                ""));

        }

        public EstoqueDisponivel(String nomeCardapio, double precoCardapio, String descricaoCardapio) {
                super(nomeCardapio, precoCardapio, descricaoCardapio);
        }

        public EstoqueDisponivel() {
        }

        public static List<EstoqueDisponivel> getEstoquePratosPromocionais() {
                return estoquePratosPromocionais;
        }

        public static List<EstoqueDisponivel> getEstoquePratosEntrada() {
                return estoquePratosEntrada;
        }

        public static List<EstoqueDisponivel> getEstoquePratosTemakiEspecial() {
                return estoquePratosTemakiEspecial;
        }

        public static List<EstoqueDisponivel> getEstoquePratosHollWassabi() {
                return estoquePratosHollWassabi;
        }

}
