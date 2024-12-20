package OOP.Snack;

public class BillingInformation  extends Customer{
    private String phoneNumber;
    private String receiversName;
    private String address;

    private String creditCardInformation;

    public String BillingInformation(String creditCardInformation){
        return this.creditCardInformation;
    }

}
class CreditCardInformation extends BillingInformation{
    BillingInformation information = new BillingInformation();
    public CreditCardInformation(){}

    private int cvv;
    private int cardExpiryMonth;
    private int CardExpiryYear;
    private String cardNumber;

    private String cardType;


}
