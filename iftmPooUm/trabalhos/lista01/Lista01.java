import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        // Inicia sistema
        exibeMenu();

        // Finaliza ou incia o sistema novamente

    }

    /**
     * Funcoes Úteis para otimizar código
     */
    // Leitura String
    public static String leitorScanner(String msg) {
        System.out.println(msg);
        Scanner s = new Scanner(System.in);
        String leitura = s.next();
        // s.close(); //Não podemos fechar, pois não consegue abrir novamente

        return leitura;
    }

    // Leitura Int
    public static int leitorScannerInt(String msg) {
        System.out.println(msg);
        Scanner s = new Scanner(System.in);
        int leitura = s.nextInt();
        // s.close(); //Não podemos fechar, pois não consegue abrir novamente

        return leitura;
    }

    // Leitura Double
    public static double leitorScannerDouble(String msg) {
        System.out.println(msg);
        Scanner s = new Scanner(System.in);
        double leitura = s.nextDouble();
        // s.close(); //Não podemos fechar, pois não consegue abrir novamente

        return leitura;

    }

    // Leitura Double
    public static String leitorScannerString() {
        Scanner s = new Scanner(System.in);
        String leitura = s.next();
        // s.close(); //Não podemos fechar, pois não consegue abrir novamente

        return leitura;

    }

    // 1) Faça um programa em java que exiba um menu com todas as opções de
    // resolução das aplicações abaixo:
    public static void exibeMenu() {
        boolean sair = false;

        System.out.println("----------MENU----------");
        System.out.println("1 - Número é maior ou igual ao segundo");
        System.out.println("2 - Raiz quadrada de segundo grau");
        System.out.println("3 - Média de dois números");
        System.out.println("4 - Tipo do triângulo");
        System.out.println("5 - Qte de somas positivas e negativas");
        System.out.println("6 - Fatores");
        System.out.println("7 - Soma dos pares, ímpares, positivos e negativos");
        System.out.println("8 - Número primo");
        System.out.println("9 - Fatorial");
        System.out.println("10 - MMC");
        System.out.println("11 - MDC");
        System.out.println("12 - Fibonacci");
        System.out.println("13 - PA");
        System.out.println("14 - PG");
        System.out.println("15 - Tabuada 1 a 10");
        System.out.println("16 - Número perfeito");
        System.out.println("17 - SAIR");

        // Le e opção
        int op = leitorScannerInt("Digite uma opcão:");

        switch (op) {
            case 1:
                numeroMaior();
                break;
            case 2:
                raizSegundoGrau();
                break;
            case 3:
                mediaDoisNumeros();
                break;
            case 4:
                tipoTriangulo();
                break;
            case 5:
                qteSomaPositivasNegativas();
                break;
            case 6:
                fatores();
                break;
            case 7:
                qteSomaImparParPositivoNegatio();
                break;
            case 8:
                numeroPrimo();
                break;
            case 9:
                fatorial();
                break;
            case 10:
                mmc();
                break;
            case 11:
                mdc();
                break;
            case 12:
                fibonacci();
                break;
            case 13:
                pa();
                break;
            case 14:
                pg();
                break;
            case 15:
                tabuada();
                break;
            case 16:
                numeroPerfeito();
                break;
            case 17:
                sair = true;
                System.out.println("SAINDO DO PROGRAMA....");
                break;
            default:
                 System.out.println("Digite uma opção válida.");
                break;
        }

        if(sair)
            System.out.println("Sistema encerrado com sucesso!");
        else
            exibeMenu();//Exibe menu novamente

    }

    // 1. Leia dois números inteiros e exiba se o primeiro número é menor, igual ou
    // maior que o segundo número
    public static void numeroMaior() {
        // Coleta os dados
        System.out.println("1. Compara 2 núemros");

        int numero1 = leitorScannerInt("Digite o primeiro número:");
        
        int numero2 = leitorScannerInt("Digite o segundo número:");

        if (primeiroNumeroEMaior(numero1,numero2))
            System.out.println("Primeiro número é maior que o segundo");
        else
            System.out.println("Primeiro número é menor igual ao segundo número");

    }
    //caclula número maior
    public static boolean primeiroNumeroEMaior(int numero1, int numero2){
        if (numero1 > numero2)
            return true;
        else
            return false;

    }


    // 2. Exiba as raízes da equação do segundo grau definida pelo usuário;
    public static void raizSegundoGrau() {

        System.out.println("2 - Cálculo de Equação do 2º Grau (ax² + bx + c = 0)");

        // Entrada dos coeficientes
        
        double a = leitorScannerDouble("Digite o coeficiente a: ");

        // O coeficiente 'a' não pode ser zero em uma equação do 2º grau
        if (a == 0) {
            System.out.println("Erro: O coeficiente 'a' não pode ser igual a zero.");
            return; // aqui finalizo
        }

        double b = leitorScannerDouble("Digite o coeficiente b: ");

        double c = leitorScannerDouble("Digite o coeficiente c: ");

        //Calcula o Delta
        double delta = delta(a,b,c);
        System.out.printf("%nO valor de Delta (Δ) é: %.2f%n", delta);

        // Análise do Delta para encontrar as raízes
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais (Delta é negativo).");
        } else if (delta == 0) {
            // Uma única raiz real (ou duas raízes iguais)
            double x = -b / (2 * a);
            System.out.printf("A equação possui uma única raiz real: x = %.2f%n", x);
        } else {
            // Duas raízes reais e diferentes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais:%n");
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        }

    }

    //calcula delta
    public static double delta(double  a, double b, double c){
        // Cálculo do Delta (b² - 4ac) 
        double delta = (b * b) - (4 * a * c);

        return delta;
    }

    // 3. Exiba a média aritmética entre dois números inteiros lidos do usuário;
    public static void mediaDoisNumeros() {
        System.out.println("3 - Média aritmética entre dois números inteiros");

        // Coleta os dados
        int numero1 = leitorScannerInt("Digite o primeiro número:");
        int numero2 = leitorScannerInt("Digite o segundo número:");

        // Calcula o a media
        System.out.println("A media entre " + numero1 + " e " + numero2 + " é igual a " + calculaMediaEntreDoisNuemros(numero1, numero2));
    }
    //Calca a média dos números
    public static int calculaMediaEntreDoisNuemros(int numero1, int numero2){
        return (numero1 + numero2) / 2;
    }


    // 4. Leia do usuário os possíveis lados de um triângulo. Caso formem triângulo,
    // exiba o tipo de triângulo formado. Caso contrário exiba mensagem informando a
    // situação;
    public static void tipoTriangulo() {
        // O que iremos fazer
        System.out.println("4 - Conforme medidas, vamos exibir qual tipo de triangulo");

        // Coletando os dados      
        int lado1 = leitorScannerInt("Dgite lado 1 do triangulo:");
        int lado2 = leitorScannerInt("Digite lado 2 do triangulo:");
        int lado3 = leitorScannerInt("Digite o lado 3 do traingulo:");

        // Validação da Condição de Existência de um Triângulo
        int tipoTriangulo = calculaTipoTrinagulo(lado1, lado2, lado3);
        switch(tipoTriangulo){
            case 1:
                System.out.println("Tipo: Triângulo Equilátero (3 lados iguais).");
                break;
            case 2:
                System.out.println("Tipo: Triângulo Isósceles (2 lados iguais).");
                break;
            case 3: 
                System.out.println("Tipo: Triângulo Escaleno (todos os lados diferentes).");
                break;
            default:
                System.out.println("ERRO: As medidas informadas NÃO podem formar um triângulo");
        }

    }
    /**
     * Calcula o tipo do tringangulo
     * @param lado1
     * @param lado2
     * @param lado3
     * @return 1 para Equilátero, 2 para Isósceles, 3 para Escaleno, 0 para ERRO
    */
    public static int calculaTipoTrinagulo(int lado1, int lado2, int lado3){
        // Validação da Condição de Existência de um Triângulo
        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            // Classificação quanto aos lados
            if (lado1 == lado2 && lado2 == lado3) {
                // Todos os três lados são iguais
                return 1;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                // Apenas dois lados são iguais
                return 2;
            } else {
                // Todos os três lados são diferentes
                return 3;
            }
        } else
            return 0;


    }


    /**
     * 5. Leia números inteiros de modo que a leitura irá finalizar quando o usuário
     * digitar zero.Os números lidos deverão
     * ser somados de modo que no final da leitura, o programa deve informar quantas
     * somas positivas e quantas
     * somas negativas ocorreram. (Se a soma der zero deve-se considera-la positiva)
     * Se o usuário digitar os números -1, -6, 3, 4, -2, 7, 9, 0 então a exibição
     * será:
     * Somas positivas = 3
     * Somas negativas = 4
     */
    public static void qteSomaPositivasNegativas() {
        // O que vamos fazer
        System.out.println("5 - Quantidade de somas positivas e negativas");

        int numero = 0;
        int qteSomaPositiva = 0;
        int qteSomaNegativa = 0;
        int soma = 0;

        do {
            // Coleta núemero para soma
            numero = leitorScannerInt("Digite um número:");

            // Efetua a soma
            soma += numero;

            if (numero == 0)
                break; // Sai do while

            // Valida e armareza a quantidade
            if (soma >= 0)
                qteSomaPositiva++;
            else
                qteSomaNegativa++;
        } while (numero != 0);

        // Exibe o resultado
        System.out.println("Somas Positivas= " + qteSomaPositiva);
        System.out.println("Somas Negativas= " + qteSomaNegativa);

    }

    // 6. Exiba os fatores de um número natural lido do usuário. Pergunte ao usuário
    // se ele deseja digitar novamente. Casoele digite o ‘s’ ou ‘S’ repita o
    // processo todo;
    public static void fatores() {
        // Declara variáveis
        int i;
        int numero;
        String op;

        // O que vamos fazer
        System.out.println("6 - Fatores de um número:");

        do {
            numero = leitorScannerInt("Digite um número:");

            // Valida se não é zero
            if (numero == 0)
                System.out.println("ERRO: Número precisa ser maior que 0");
            else {
                // Calcula fatores
                for (i = 1; i <= numero; i++) {
                    // Valida se a divisão tem resto 0
                    if (numero % i == 0)
                        System.out.print(i + " ");

                }

            }
            op = leitorScanner("Deseja continuar (S) para sim: ");

        } while (op.equals("s") || op.equals("S")); // op.equalsIequalsIgnoreCase("S") não funcionou

    }

    /*
     * 7. Leia do usuário números inteiros e calcule a quantidade e a soma de
     * números pares, ímpares, positivos e
     * negativos digitados. Na leitura dos números, se o usuário digitar zero, o
     * processo deve ser finalizado, e a exibição
     * dos cálculos deve ser feita;
     */
    public static void qteSomaImparParPositivoNegatio(){
        //Declara variáveis
        int numero = 0;
        int somaPar = 0;
        int somaImpar = 0;
        int somaPositivo = 0;
        int somaNegativo = 0;
        
        
        //O que iremos fazer
        System.out.println("7 - Lista de números, qte de pares, impares, negativos e positivos");

        //Coleta dados
        do {
            numero = leitorScannerInt("Digite um número:");

            //Para se for 0
            if(numero == 0)
                break; //para o while

            //Armazena as somas positivas ou negativas
            if(numero > 0)
                somaPositivo += numero;
            else
                somaNegativo += numero;

            //Armenza as soma de impares ou pares
            if(numero % 2 == 0)
                somaPar += numero;
            else
                somaImpar += numero;
        }while (numero != 0);

        //Exibe as somas
        System.out.println("Soma dos números positivos = " + somaPositivo);
        System.out.println("Soma dos números negativos = " + somaNegativo);
        System.out.println("Soma dos números pares = " + somaPar);
        System.out.println("Soma dos números impares = " + somaImpar);
        

    }

    //8. Leia do usuário um número natural e verifica se o número é primo ou não;
    public static void numeroPrimo(){
        //O que iremos fazer
        System.out.println("8 - Se o número é primo");

        //Coleta os dados
        int numero = leitorScannerInt("Digite um número:");

        //Validar se é um número primo
        if (ePrimo(numero))
            System.out.println("O número é PRIMO"); //Caso ele não retorno no for ele é um número primo
        else
            System.out.println("O número NÃO é PRIMO");

       
        

    }

    //Função para validar se o número é primo e reutilizamos
    public static boolean ePrimo(int numero){
        //Validar se é um número primo
        for (int i = 2; i < numero; i++){
            
            //Valida, imprimi a mensagem e sai do metodo
            if(numero % i == 0)
                return false;
            
        }

        return true;
    }


    //9. Leia do usuário um número natural, calcule e exiba o seu fatorial;
    public static void fatorial(){
        
        //O que iremos fazer
        System.out.println("9 - Fatorial de um número:");

        //Coleta os dados
        int numero = leitorScannerInt("Digite um número");

        //Calcula o fatorial
        int fatorial = calculaFatorial(numero);
       
        //Imprimi resultado
        System.out.println("O Fatoiral de "+ numero +" = " + fatorial);
    }
    //Calcula o Fatorial de um número
    public static int calculaFatorial(int numero){
        //Declara variávies
        int fatorial = 1;

        //Calcula o fatorial
        for (int i = 1; i <= numero; i++){
            fatorial *= i;

        }
        return fatorial;
    }


    //10. Leia do usuário dois números naturais maiores que zero, calcule e exiba o MMC deles;
    public static void mmc(){       
        //o que vamos fazer
        System.out.println("10 - Calcular MMC");

        //Coleta os dados
        int numero1 = leitorScannerInt("Digite o primeiro um número");
        int numero2 = leitorScannerInt("Digite o segundo um número");

        int mmc = calcaulaMMC(numero1, numero2);

        System.out.println("O MMC de "+ numero1 +" e " + numero2 + " = "+ mmc);

    }
    
    //Função para caulcar MMC
    public static int calcaulaMMC(int a, int b){
        int mmc = 1; 
        int divisorPrimo = 2;
        int divisor = divisorPrimo;


        //vou fazer pelo metodo dos números primos
        while (a > 1 || b > 1){

            //Valida se o dividor é primo, poderia usar a função que criei mas lah apenas imprimi
            if(ePrimo(divisorPrimo)){
                //valida se divisão pelo primo o resto não é 0
                if(a % divisorPrimo == 0 || b % divisorPrimo == 0){

                    mmc *= divisorPrimo;

                    //Conserva o divisão, visot que o divisor primo pode ser alterado abaixo
                    divisor = divisorPrimo;

                    //valida se vai mudar o dividor
                    if(!(a % divisorPrimo == 0) || !(b % divisorPrimo == 0))
                        divisorPrimo++;
                    
                    //Divida a e b pelos primos

                    //tenho que checar novamente pois a ou b talez não divida pelo primo
                    a = a % divisor == 0 ? a / divisor : a;
                    b = b % divisor == 0 ? b / divisor : b;

                   

                }else

                    divisorPrimo++;

            }else{
                 divisorPrimo++;
            }            
        }

        return mmc;
        

    }


    //11. Leia do usuário dois números naturais maiores que zero, calcule e exiba o MDC deles;
    public static void mdc(){
        //O que vamos fazer
        System.out.println("11 - MDC, máximo divisor comum");

        //Coleta os dados
        int numero1 = leitorScannerInt("Digite o primeiro um número");
        int numero2 = leitorScannerInt("Digite o segundo um número");
        
        //Calcula MDC
        int mdc = calculaMDC(numero1,numero2);

        System.out.println("O MDC de "+ numero1 +" e " + numero2 + " = "+ mdc);


    }

    //Calcula MDC
    public static int calculaMDC(int a, int b){
        //Declara variáveis
        int mdc = 1; 
        int divisorPrimo = 2;
        int divisor = divisorPrimo;

        //vou fazer pelo metodo dos números primos
        while (a > 1 || b > 1){

            //Valida se o dividor é primo, poderia usar a função que criei mas lah apenas imprimi
            if(ePrimo(divisorPrimo)){
                //valida se divisão pelo primo o resto não é 0
                if(a % divisorPrimo == 0 && b % divisorPrimo == 0){
                     mdc *= divisorPrimo;
                }
                    
                //Conserva o divisão, visot que o divisor primo pode ser alterado abaixo
                divisor = divisorPrimo;

                //valida se vai mudar o dividor
                if(!(a % divisorPrimo == 0) && !(b % divisorPrimo == 0))
                    divisorPrimo++;
                    
                //Divida a e b pelos primos

                //tenho que checar novamente pois a ou b talez não divida pelo primo
                a = a % divisor == 0 ? a / divisor : a;
                b = b % divisor == 0 ? b / divisor : b;       
               

            }else{
                 divisorPrimo++;
            }            
        }

        
        return mdc;
    }

    //12. Exiba a sequência de Fibonacci definida pelo usuário;
    public static void fibonacci(){
        //O que vamos fazer
        System.out.println("12 - Fibonacci de um número");

        //Coleta os dados
        int numero = leitorScannerInt("Digite o primeiro um número");

        //Calcula Fibocni de forma recursiva
        System.out.println("O Fibonacci de " + numero + " = " + calcularFibonacci(numero));
    }

    public static int calcularFibonacci(int n) {
        //Casos de parada (Casos Base)
        if (n == 0) 
            return 0;       
        if (n == 1)
            return 1;  

        //Chamada recursiva (O método chama a si mesmo)
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    //13. Exiba a PA definida pelo usuário;
    public static void pa(){
        //O que vamos fazer
        System.out.println("13 - PA Professão Aritimética");

        //Coleta dados
        int a1 = leitorScannerInt("Digite o primeiro termo da PA (a1): ");
        int r = leitorScannerInt("Digite a razão da PA (r): ");
        int n = leitorScannerInt("Quantos termos você deseja exibir? ");

        //Imprimi a PA
        System.out.print("PA é: " + a1);
        for (int i = 1; i < n ; i++){
            a1 += r;
            System.out.print(", " + a1);
        }      
    }

    //14. Exiba a soma dos elementos da PG definida pelo usuário;
    public static void pg(){
        //O que vamos fazer
        System.out.println("14 - PG Progressão Geometrica");

        //Coleta dados
        int a1 = leitorScannerInt("Digite o primeiro termo da PG (a1): ");
        int q = leitorScannerInt("Digite a razão da PG (q): ");
        int n = leitorScannerInt("Quantos termos você deseja exibir? ");

        //Imprimi a PG
        System.out.print("PG é: " + a1);
        for (int i = 1; i < n ; i++){
            a1 *= q;
            System.out.print(", " + a1);
        }      
    }

    //15. Exiba a tabuada de multiplicação de 1 a 10;
     public static void tabuada(){
        //O que vamos fazer
        System.out.println("15 - Tabuada de mutiplicação");

        //Coleta dados
        int numero = leitorScannerInt("Digite um número: ");

        //Calcula e imprmi tabuada
        for (int i = 1; i <= 10; i++)
            System.out.println(numero + " * " + i + " = " + numero * i);
     }

     //16. Leia do usuário um número natural e verifica se ele é perfeito ou não
     public static void numeroPerfeito(){
        //O que vamos fazer
        System.out.println("16 - Número Quadrado Perfeito");

        //Coleta dados
        int numero = leitorScannerInt("Digite um número: ");

        //vou validar sae a raiz é exata
        if(eNumeroPerfeito(numero))
            System.out.print("O número é um Qadrado perfeito");
        else
            System.out.print("O número NÃO é um quadrado perfeito");

     }

     //Valida se é u número perfeito
     public static boolean eNumeroPerfeito(int numero){
        
        //Vou fazer pela raiz quadrada
        double raiz = Math.sqrt(numero);

        //Vou converter para int e voltar para double
        double raizSemVirgula = (int)raiz;

        //vou validar sae a raiz é exata
        if(raiz == raizSemVirgula)
            return true;
        else
            return false;


     }

}
