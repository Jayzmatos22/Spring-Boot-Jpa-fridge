package fridge.fridgeSistem.repository;

import fridge.fridgeSistem.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
