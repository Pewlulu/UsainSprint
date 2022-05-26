package Controller.Owner;

import model.Orders;

public class generateReportController {

    public String fromDate;
    public String toDate;
    public String Status;

    public Float AveData() {
        Float avger = 0f;
        Orders Or = new Orders();
        avger = Or.GetAvg(fromDate, toDate,Status);
        return avger;
    }

    public Orders HighP() {
        Orders Or = new Orders();
        Or.HighPrice(fromDate, toDate,Status);
        Or.MaxItem(fromDate, toDate,Status);
        Or.MinItem(fromDate, toDate,Status);
        return Or;
    }

}
