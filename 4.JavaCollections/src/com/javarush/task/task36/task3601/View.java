package com.javarush.task.task36.task3601;

public class View{

    public View(){

    }
    public void fireShowDataEvent() {
        Controller controller = new Controller();

        System.out.println(controller.onShowDataList());
    }


}

/*
MVC - простая версия
В отдельных файлах создай классы Service, Model, View, Controller.
Распредели методы из класса Solution по созданным классам учитывая, что должен получиться MVC.
Создай нужные поля класса при необходимости.
Не добавляй своих других методов.
Метод main() оставь в классе Solution.


Требования:
1. Создай класс Service в отдельном файле.
2. Создай класс Model в отдельном файле.
3. Создай класс View в отдельном файле.
4. Создай класс Controller в отдельном файле.
5. Перемести реализацию метода getData() в подходящий класс.
6. Перемести реализацию метода getStringDataList() в подходящий класс. Учти, что метод getData() находится не в классе Solution.
7. Перемести реализацию метода onShowDataList() в подходящий класс. Учти, что метод getStringDataList() находится не в классе Solution.
8. Перемести реализацию метода fireShowDataEvent() в подходящий класс. Учти, что метод onShowDataList() находится не в классе Solution.
9. Метод main() должен создать объект типа View и вызвать у него подходящий метод. Поведение программы не должно измениться.
 */