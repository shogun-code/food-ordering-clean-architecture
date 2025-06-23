package io.shogun.payment.service.domain.mapper;

import io.shogun.domain.valueobject.CustomerId;
import io.shogun.domain.valueobject.Money;
import io.shogun.domain.valueobject.OrderId;
import io.shogun.payment.service.domain.dto.PaymentRequest;
import io.shogun.payment.service.domain.entity.Payment;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentDataMapper {

    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customerId(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();
    }
}