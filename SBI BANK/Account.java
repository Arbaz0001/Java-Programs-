public class Account {
    public static void main(String[] args) {
        Sbi customer = new Sbi(10000d);
        customer.blanceInquiry();
        customer.addAmount(2000d);
        customer.blanceInquiry();

        customer.withdrow(4000d);
        customer.blanceInquiry();

    }
}
