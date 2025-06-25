package io.shogun.payment.service.domain.event;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class PaymentCancelledEvent extends PaymentEvent {
    public PaymentCancelledEvent(Payment payment,
                                 ZonedDateTime createdAt,
                                 List<String> failureMessages) {
        super(payment, createdAt, Collections.emptyList());
    }
}