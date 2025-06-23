package io.shogun.payment.service.domain.ports.output.message.listener;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.payment.service.domain.event.PaymentCancelledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCancelledEvent> {
}
