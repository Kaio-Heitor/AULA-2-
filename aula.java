class aula {
    public static void main(String[] args) {
        int idade;
        idade = 15;

        int IdadenoAnoQueVem = idade + 1;

        double metadedaidade = idade / 2;

        double resultado = idade % 2;

        boolean tiposangue;
        tiposangue = 'a' == 'A';

        if(idade < 18)
        System.out.println("Menor");

        if(idade >= 18)
        System.out.println("Maior");

        System.out.println(idade);
        System.out.println(IdadenoAnoQueVem);
        System.out.println(metadedaidade);
        System.out.println(resultado);
        System.out.println(tiposangue);

        int i = 5;
        int j = i;
        i = i + 1;

        System.out.println(i);
        System.out.pirntln(j);
    }
}