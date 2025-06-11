//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Movies movie1 = new Movies("Donnie Darko", 120,"R","Richard Kelly");
       Movies movie2 = new Movies("Fury", 145, "R","David Ayer");
       System.out.println("movie1:" + movie1.getTitle() + "," + movie1.getRating() + ",directed by " + movie1.getDirector());
       System.out.println("movie2:" + movie2.getTitle() + "," + movie2.getRating() + ",directed by " + movie2.getDirector());

    }
}









