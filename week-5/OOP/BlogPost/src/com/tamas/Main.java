package com.tamas;

public class Main {

    public static void main(String[] args) {
//        Készíts egy BlogPost osztályt, amely rendelkezik a következő tulajdonságokkal:
//        authorName (szerző neve)
//        title (cím)
//        text (szöveg)
//        publicationDate (kiadási dátum)
//        Készíts néhány BlogPost példányt:
//        Egyet "Lorem Ipsum" címmel, amelyet John Doe posztolt "2000.05.04."-én, a következő szöveggel:
//        "Lorem ipsum dolor sit amet."
//        Egyet "Wait but why" címmel Tim Urban-tól, "2010.10.10."-én, a következő szöveggel:
//        "A popular long-form, stick-figure-illustrated blog about almost everything."
//        Egyet "One Engineer Is Trying to Get IBM to Reckon With Trump" címmel William Turton-tól, "2017.03.28."-án, a következő szöveggel:
//        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing."

        BlogPost loremIpsum = new BlogPost("John Doe", "Lorem Ipsum",  "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost waitButWhy = new BlogPost("Tim Urban", "Wait but why",  "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost something = new BlogPost("John Doe", "One Engineer Is Trying to Get IBM to Reckon With Trump",  "Lorem ipsum dolor sit amet.", "2000.05.04.");

        something.setAuthorName("William Turton");

        System.out.println(something.getAuthorName());
    }

}
