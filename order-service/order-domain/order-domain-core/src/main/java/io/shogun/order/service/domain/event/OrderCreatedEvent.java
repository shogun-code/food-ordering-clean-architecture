package io.shogun.order.service.domain.event;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {
    public OrderCreatedEvent(Order order,
                             ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}