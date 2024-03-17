package proyect.laboratorio;


public class Tarea {
    private String name;
    private boolean isComplete;

    public Tarea(String name) {
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return name + (isComplete ? " (Completada)" : "");
    }

    
}
