package lesson1;

public class VisitCard {
    public static void main(String[] args) {
        int age=31;
        String
                name="Lana",
                family="Sydorenko",
                company="signNow",
                job="SQA Engineer",
                phone="+38 (066) 354 54 84",
                tg="Lana_si";
        String fullname = name+" "+family;
        System.out.println(fullname+" "+"\n"+job+" in "+company+", "+"\nAge: "+age+"\nPhone: "+phone+"\nTelegram: "+tg);
    }
}
