package factorialnumeroobjeto;

public class factorial {

    long num, fact, i;

    public factorial(long num) {
        this.num = num;
    }

    public long calcular() {
        fact = num;
        for (i = 1; i < num; i++) {

            fact = fact * i;

        }
        long facto = fact;
        return facto;

    }
}
