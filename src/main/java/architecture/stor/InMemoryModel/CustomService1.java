package architecture.stor.InMemoryModel;

public class CustomService1 implements   ModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("CustomService1 reacted on model changed");

    }
}
