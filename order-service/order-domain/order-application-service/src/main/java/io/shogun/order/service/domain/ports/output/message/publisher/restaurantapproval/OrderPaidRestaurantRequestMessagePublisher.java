package io.shogun.order.service.domain.ports.output.message.publisher.restaurantapproval;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
