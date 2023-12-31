public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book kapitanskayaDochka = new Book("Капитанская дочка", pushkin, 1836);

        Author lermontov = new Author("Михаил", "Лермонтов");
        Book geroyNashegovremeny = new Book("Герой нашего времени", lermontov, 1839);

        System.out.println(kapitanskayaDochka.getName());
        System.out.println(kapitanskayaDochka.getYear());
        kapitanskayaDochka.setYear(1835);
        System.out.println(kapitanskayaDochka.getYear());

        System.out.println(geroyNashegovremeny.getName());
        System.out.println(geroyNashegovremeny.getYear());
        geroyNashegovremeny.setYear(1800);
        System.out.println(geroyNashegovremeny.getYear());
    }
}
