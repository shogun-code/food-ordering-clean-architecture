package io.shogun.payment.service.domain.ports.output.repository;

import io.shogun.domain.valueobject.CustomerId;
import io.shogun.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
