package pbo5;

abstract class BangunDatar {

    abstract double luas();

    abstract double keliling();
}

class Persegi extends BangunDatar {

    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {

    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

class Segitiga extends BangunDatar {

    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}

public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(3, 4);

        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.printf("Luas Lingkaran: %.2f\n", lingkaran.luas());
        System.out.printf("Keliling Lingkaran: %.2f\n", lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.printf("Keliling Segitiga: %.2f\n", segitiga.keliling());
    }
}
