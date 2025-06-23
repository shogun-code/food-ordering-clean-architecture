package io.shogun.order.service.domain.ports.output.message.publisher.payment;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
