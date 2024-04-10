public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int kVal = tickets[k];
        int res = 0;
        for (int i = 0; i < tickets.length; ++i) {
            res += Math.min(kVal, tickets[i]);

            if(i > k && tickets[i] >= kVal) {
                res--;
            }
            
        }
        return res;
    }
}
