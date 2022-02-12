package com.example.hanausightseeing;

public class Controller {

    MainActivity mainView;
    Model model;

    public Controller(MainActivity mainView) {
        this.mainView = mainView;
        model = new Model();
        start();
    }

    void start() {
        mainView.updateSehenswuerdigkeiten(model.getSehenswürdigkeiten());
    }
}
