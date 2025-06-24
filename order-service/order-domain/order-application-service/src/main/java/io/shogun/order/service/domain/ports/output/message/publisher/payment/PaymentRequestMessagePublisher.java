package io.shogun.order.service.domain.ports.output.message.publisher.payment;

import io.shogun.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
import io.shogun.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface PaymentRequestMessagePublisher {

    void publish(OrderPaymentOutboxMessage orderPaymentOutboxMessage,
                 BiConsumer<OrderPaymentOutboxMessage, OutboxStatus> outboxCallback);
}
