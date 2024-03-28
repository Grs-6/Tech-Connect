package MementoDP;
import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<TextMemento> states = new ArrayList<>();
    int lastIndex;

    public void saveState(TextMemento state) {
        states.add(state);
        lastIndex = states.size() - 1;
    }

    

    public TextMemento undo() {
        if (!states.isEmpty()) {
            lastIndex --;
            return states.get(lastIndex);
        }
        return null;
    }
}