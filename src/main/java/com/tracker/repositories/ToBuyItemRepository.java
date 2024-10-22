package com.tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tracker.models.ToBuyItem;
import com.tracker.models.User;
import com.tracker.models.enums.*;
import java.util.List;
import java.util.Date;

public interface ToBuyItemRepository extends JpaRepository<ToBuyItem, Long> {

    // Parent: find all to buy items
    List<ToBuyItem> findByUser(User user);

    // Parent: find all to buy items by type
    List<ToBuyItem> findByUserAndType(User user, Type type);

    // Parent: find ll to buy items by size
    List<ToBuyItem> findByUserAndSize(User user, Size size);

    // Parent: find all to buy items by season
    List<ToBuyItem> findByUserAndSeason(User user, Season season);

    // Parent: find all to buy items with a specific buy-by date or before
    List<ToBuyItem> findByUserAndBuyByBefore(User user, Date buyBy);

    // Parent: find all to buy items for a user sorted by buy-by date in ascending order (soonest first)
    List<ToBuyItem> findByUserOrderByBuyByAsc(User user);

    // Parent: find all to buy items for a user sorted by buy-by date in descending order (latest first)
    List<ToBuyItem> findByUserOrderByBuyByDesc(User user);

    // Parent: Count all to-buy items for a user
    Integer countByUser(User user);

    // Parent: Count all to buy items for a user and season
    Integer countByUserAndSeason(User user, Season season);

    // Parent: Count all to buy items for a user of a certain type
    Integer countByUserAndType(User user, Type type);
}
