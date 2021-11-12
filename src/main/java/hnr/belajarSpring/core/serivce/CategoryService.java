package hnr.belajarSpring.core.serivce;

import hnr.belajarSpring.core.Repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

}
