package io.shogun.restaurant.service.domain;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.restaurant.service.domain.entity.Restaurant;
import io.shogun.restaurant.service.domain.event.OrderApprovalEvent;
import io.shogun.restaurant.service.domain.event.OrderApprovedEvent;
import io.shogun.restaurant.service.domain.event.OrderRejectedEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant,
                                     List<String> failureMessages,
                                     DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher,
                                     DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher);
}
