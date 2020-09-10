import java.util.List;


public class ManageDemand {
    public long filledOrders(List<Long> orders, long k){

        long cont = 0;
        long widgets = 0;

        for(int i = 0; i < orders.size(); i++){
            widgets += orders.get(i);
            if(widgets < k) {
                cont++;
            }
        }
        return cont;
    }
}
