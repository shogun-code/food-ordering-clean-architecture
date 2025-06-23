package io.shogun.restaurant.service.domain.mapper;

import io.shogun.domain.valueobject.Money;
import io.shogun.domain.valueobject.OrderId;
import io.shogun.domain.valueobject.OrderStatus;
import io.shogun.domain.valueobject.RestaurantId;
import io.shogun.restaurant.service.domain.dto.RestaurantApprovalRequest;
import io.shogun.restaurant.service.domain.entity.OrderDetail;
import io.shogun.restaurant.service.domain.entity.Product;
import io.shogun.restaurant.service.domain.entity.Restaurant;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class RestaurantDataMapper {
    public Restaurant restaurantApprovalRequestToRestaurant(RestaurantApprovalRequest
                                                                    restaurantApprovalRequest) {
        return Restaurant.builder()
                .restaurantId(new RestaurantId(UUID.fromString(restaurantApprovalRequest.getRestaurantId())))
                .orderDetail(OrderDetail.builder()
                        .orderId(new OrderId(UUID.fromString(restaurantApprovalRequest.getOrderId())))
                        .products(restaurantApprovalRequest.getProducts().stream().map(
                                        product -> Product.builder()
                                                .productId(product.getId())
                                                .quantity(product.getQuantity())
                                                .build())
                                .collect(Collectors.toList()))
                        .totalAmount(new Money(restaurantApprovalRequest.getPrice()))
                        .orderStatus(OrderStatus.valueOf(restaurantApprovalRequest.getRestaurantOrderStatus().name()))
                        .build())
                .build();
    }
}
