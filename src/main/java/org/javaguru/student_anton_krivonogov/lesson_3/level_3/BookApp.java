package org.javaguru.student_anton_krivonogov.lesson_3.level_3;

class BookApp {
    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("it1", "aa");
        Chapter chapter2 = new Chapter("it2", "bb");
        Book book1 = new Book("a","b",2004, chapter1, chapter2);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        System.out.println(book1.getChapter1().getText());
        System.out.println(book1.getChapter1().getTitle());
        System.out.println(book1.getChapter2().getText());
        System.out.println(book1.getChapter2().getTitle());

        chapter1 = new Chapter("it3", "dd");
        chapter2 = new Chapter("it4", "ddd");
        Book book2 = new Book("a","b",2004, chapter1, chapter2);
        System.out.println(book2);


    }
}
