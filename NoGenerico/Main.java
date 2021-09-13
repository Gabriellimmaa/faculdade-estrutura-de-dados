class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Carro car1 = new Carro();
        car1.cadastraProd("BMW 320i", "BMW", "Branca", 86.000, 2);
        lista.cadastra(new No(car1));

        Carro car2 = new Carro();
        car2.cadastraProd("Jetta GTI", "Volkswagen", "Branca", 102.500, 10);
        lista.cadastra(new No(car2));

        Carro car3 = new Carro();
        car3.cadastraProd("Cruze", "Chevrolet", "Preto", 140.500, 6);
        lista.cadastra(new No(car3));

        lista.imprimeLista();
    }
}