package Ej1;
public class Main {
    public static void main(String[] args) {
        Task task = new Task("Do laundry");
        TaskView view = new TaskView();
        TaskController controller = new TaskController(task, view);

        // Mostrar tarea antes de marcarla como completada
        controller.updateView();

        // Marcar tarea como completada y mostrarla nuevamente
        controller.setTaskCompleted(true);
        controller.updateView();
    }
}
