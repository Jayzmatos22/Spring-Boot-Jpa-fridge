package fridge.fridgeSistem.service;

import fridge.fridgeSistem.model.Food;
import fridge.fridgeSistem.repository.FoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Listagem
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    // criar
    public Food save(Food food){
        return foodRepository.save(food);
    }

    // Deletar
    public void delete(Long id){
        foodRepository.deleteById(id);
    }
}
