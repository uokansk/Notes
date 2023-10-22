package architecture.stor.InMemoryModel;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {

    private Collection<ModelChangedObserver> changedObservers = new ArrayList<>();


    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : changedObservers) {
            observer.applyUpdateModel();
        }

    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changedObservers.add(o);

    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changedObservers.remove(o);

    }


}
