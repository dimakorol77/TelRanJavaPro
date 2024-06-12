package org.example.lessons.lesson7;

public class Presenter {

    //Создать класс Presenter для управления взаимодействием между моделью и представлением:
    //
    //Конструктор Presenter(Model m, View v): принимает модель и представление.
    //Метод void buttonClick(): получает значения a и b от пользователя, устанавливает их в модель, вычисляет результат и выводит его на экран.
    protected  Model model;
    protected View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClick () {
        int a = view.getValue("число1");
        int b = view.getValue("число2");
        model.setX(a);
        model.setY(b);

        int result = model.result();
        view.print(result, "Результат");

}
}
