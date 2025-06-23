package io.shogun.order.service.domain.ports.output.repository;

import io.shogun.domain.valueobject.OrderId;
import io.shogun.order.service.domain.entity.Order;
import io.shogun.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
