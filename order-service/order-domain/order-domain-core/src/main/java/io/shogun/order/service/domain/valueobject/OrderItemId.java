package io.shogun.order.service.domain.valueobject;

import io.shogun.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
