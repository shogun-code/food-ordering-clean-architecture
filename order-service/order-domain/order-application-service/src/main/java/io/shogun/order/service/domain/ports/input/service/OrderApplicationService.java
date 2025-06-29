package io.shogun.order.service.domain.ports.input.service;

import io.shogun.order.service.domain.dto.create.CreateOrderCommand;
import io.shogun.order.service.domain.dto.create.CreateOrderResponse;
import io.shogun.order.service.domain.dto.track.TrackOrderQuery;
import io.shogun.order.service.domain.dto.track.TrackOrderResponse;
import jakarta.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
