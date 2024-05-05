package com.example.web.item;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findTop1ByProductIdAndMemberId(Long productId, Long memberId);
}
