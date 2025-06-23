package io.shogun.order.service.domain.ports.output.message.publisher.payment;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
