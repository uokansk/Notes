package architecture.stor.sem08hw.Presenters;

import architecture.stor.sem08hw.Models.Table;

import java.util.Collection;

public interface View {

    void registerObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

}