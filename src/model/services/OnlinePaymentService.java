package model.services;

public interface OnlinePaymentService {

    double paymentFee(Double amount) ;
	double interst(Double amount , int months);
}
