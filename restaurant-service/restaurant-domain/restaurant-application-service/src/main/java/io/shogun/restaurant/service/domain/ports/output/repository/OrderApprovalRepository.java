package io.shogun.restaurant.service.domain.ports.output.repository;

import io.shogun.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
