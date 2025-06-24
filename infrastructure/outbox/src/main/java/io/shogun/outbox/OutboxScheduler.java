package io.shogun.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
