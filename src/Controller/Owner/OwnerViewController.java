package Controller.Owner;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

public class OwnerViewController {

    public static Iterator<Orders> ViewTable(String FDate, String TDate,String oStatus) {
        ArrayList<Orders> list = Orders.ReportOut(FDate, TDate,oStatus);
        Iterator<Orders> itr = list.iterator();
        return itr;
    }
}
