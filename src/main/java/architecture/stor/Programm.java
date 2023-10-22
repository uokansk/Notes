package architecture.stor;

import architecture.stor.InMemoryModel.CustomService1;
import architecture.stor.InMemoryModel.CustomService2;
import architecture.stor.InMemoryModel.CustomService3;
import architecture.stor.InMemoryModel.ModelStore;

public class Programm {
    public static void main(String[] args) {

        ModelStore modelStore = new ModelStore();

        CustomService1 customService1 = new CustomService1();
        CustomService2 customService2 = new CustomService2();
        CustomService3 customService3 = new CustomService3();

        modelStore.registerModelChanger(customService1);
        modelStore.registerModelChanger(customService2);
        modelStore.registerModelChanger(customService3);

    }
}
