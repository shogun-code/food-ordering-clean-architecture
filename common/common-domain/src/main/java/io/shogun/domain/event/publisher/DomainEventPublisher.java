package io.shogun.domain.event.publisher;

import io.shogun.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
