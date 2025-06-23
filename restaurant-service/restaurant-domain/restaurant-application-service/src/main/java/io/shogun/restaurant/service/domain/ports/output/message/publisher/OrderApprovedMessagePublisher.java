package io.shogun.restaurant.service.domain.ports.output.message.publisher;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.restaurant.service.domain.event.OrderApprovedEvent;

public interface OrderApprovedMessagePublisher extends DomainEventPublisher<OrderApprovedEvent> {
}
