public class Desafio {
    public static void main(String[] args) {
        System.out.println(somaDigitos(801));
    }

    public static int somaDigitos(int n){
        if(n/10 == 0) return n;
        return somaDigitos(somaDigitos(n / 10) + somaDigitos(n % 10)); 
    }
}

