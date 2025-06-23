package io.shogun.payment.service.domain.ports.output.message.listener;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.payment.service.domain.event.PaymentCompletedEvent;

public interface PaymentCompletedMessagePublisher extends DomainEventPublisher<PaymentCompletedEvent> {
}
