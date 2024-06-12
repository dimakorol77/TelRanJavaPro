package org.example.lessons.lesson7;

public class Program {
    public static void main(String[] args) {
            MultiModel model =new MultiModel();
            View view = new View();
            Presenter presenter = new Presenter(model,view);

            presenter.buttonClick();
    }
}
