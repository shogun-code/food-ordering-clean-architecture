package io.shogun.payment.service.domain;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.payment.service.domain.entity.CreditEntry;
import io.shogun.payment.service.domain.entity.CreditHistory;
import io.shogun.payment.service.domain.entity.Payment;
import io.shogun.payment.service.domain.event.PaymentCancelledEvent;
import io.shogun.payment.service.domain.event.PaymentCompletedEvent;
import io.shogun.payment.service.domain.event.PaymentEvent;
import io.shogun.payment.service.domain.event.PaymentFailedEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages,
                                            DomainEventPublisher<PaymentCompletedEvent>
                                                    paymentCompletedEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages, DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);
}