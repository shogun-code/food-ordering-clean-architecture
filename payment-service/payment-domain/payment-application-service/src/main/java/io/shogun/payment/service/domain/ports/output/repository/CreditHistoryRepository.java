package io.shogun.payment.service.domain.ports.output.repository;

import io.shogun.domain.valueobject.CustomerId;
import io.shogun.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
