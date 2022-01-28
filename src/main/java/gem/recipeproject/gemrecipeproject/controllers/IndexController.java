package gem.recipeproject.gemrecipeproject.controllers;

import gem.recipeproject.gemrecipeproject.entities.Category;

import gem.recipeproject.gemrecipeproject.entities.UnitOfMeasure;
import gem.recipeproject.gemrecipeproject.repositories.CategoryRepository;
import gem.recipeproject.gemrecipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;


@Controller
public class IndexController
{
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository)
    {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findById(75L);
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findById(152L);

        System.out.println("Cat Id is: " + categoryOptional.get().getCategoryId());
        System.out.println("Cat Description is: " + categoryOptional.get().getDescription());

        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getUnitOfMeasureId());
        System.out.println("UOM Description is: " + unitOfMeasureOptional.get().getDescription());

        return "index";
    }

}
