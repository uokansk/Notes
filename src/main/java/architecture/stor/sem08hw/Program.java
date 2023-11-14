package architecture.stor.sem08hw;

import architecture.stor.sem08hw.Models.TableModel;
import architecture.stor.sem08hw.Presenters.BookingPresenter;
import architecture.stor.sem08hw.Presenters.Model;
import architecture.stor.sem08hw.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = (Model) new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Станислав");
        view.changeReservationTable(1001, new Date(), 2, "Станислав");
    }

}
