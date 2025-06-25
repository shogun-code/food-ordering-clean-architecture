package io.shogun.payment.service.domain.ports.output.message.publisher;

import io.shogun.outbox.OutboxStatus;
import io.shogun.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}