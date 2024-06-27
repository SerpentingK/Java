package Ej1;
public class TaskController {
    private Task model;
    private TaskView view;

    public TaskController(Task model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void setTaskCompleted(boolean completed) {
        model.setCompleted(completed);
    }

    public void updateView() {
        view.displayTask(model);
    }
}
