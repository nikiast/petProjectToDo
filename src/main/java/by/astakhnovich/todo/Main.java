package by.astakhnovich.todo;

import by.astakhnovich.todo.controller.TaskController;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskController taskMenuController = new TaskController();
        taskMenuController.taskMenu();
    }
}