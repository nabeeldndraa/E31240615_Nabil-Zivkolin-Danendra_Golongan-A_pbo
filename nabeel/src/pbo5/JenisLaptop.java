package pbo5;
// Kelas induk (superclass)
class Laptop {
    void fitur() {
        System.out.println("Laptop memiliki fitur dasar...");
    }
}

// Kelas Turunan 1 (Asus)
class Asus extends Laptop {
    @Override
    void fitur() {
        System.out.println("Asus: Dilengkapi dengan teknologi ROG Gaming!");
    }
}

// Kelas Turunan 2 (MacBook)
class MacBook extends Laptop {
    @Override
    void fitur() {
        System.out.println("MacBook: Dilengkapi dengan macOS dan chip M1!");
    }
}

// Kelas Turunan 3 (Lenovo)
class Lenovo extends Laptop {
    @Override
    void fitur() {
        System.out.println("Lenovo: Dilengkapi dengan fitur ThinkPad untuk bisnis!");
    }
}

// Kelas Main untuk menjalankan program
public class JenisLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Asus();
        Laptop laptop2 = new MacBook();
        Laptop laptop3 = new Lenovo();

        laptop1.fitur();
        laptop2.fitur();
        laptop3.fitur();
    }
}