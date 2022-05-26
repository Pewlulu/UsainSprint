package Controller.Owner;

import model.Orders;

public class CheckDateController {

    public String CheckBigDate() {
        String BigDate = "";
        Orders or = new Orders();
        BigDate = or.CheckMaxDate();
        return BigDate;
    }

    public String CheckSmallDate() {

        String SmallDate = "";
        Orders or = new Orders();
        SmallDate = or.CheckMinDate();
        return SmallDate;
    }
}
