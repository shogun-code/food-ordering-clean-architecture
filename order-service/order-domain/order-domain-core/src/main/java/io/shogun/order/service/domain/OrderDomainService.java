package io.shogun.order.service.domain;

import io.shogun.domain.event.publisher.DomainEventPublisher;
import io.shogun.order.service.domain.entity.Order;
import io.shogun.order.service.domain.entity.Restaurant;
import io.shogun.order.service.domain.event.OrderCancelledEvent;
import io.shogun.order.service.domain.event.OrderCreatedEvent;
import io.shogun.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}