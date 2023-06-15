package guru.springframework.controllers;

import guru.springframework.Model.Category;
import guru.springframework.Model.UnitOfMeasure;
import guru.springframework.Repos.CategoryRepo;
import guru.springframework.Repos.UnitOfMeasureRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private  final CategoryRepo categoryRepo;
    private final UnitOfMeasureRepo unitOfMeasureRepo;

    public IndexController(CategoryRepo categoryRepo, UnitOfMeasureRepo unitOfMeasureRepo) {
        this.categoryRepo = categoryRepo;
        this.unitOfMeasureRepo = unitOfMeasureRepo;
    }

    @RequestMapping({"/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional= categoryRepo.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional= unitOfMeasureRepo.findByDescription("Teaspoon");
        System.out.println("category id is "+ categoryOptional.get().getId());
        System.out.println("Unite of mes id is "+unitOfMeasureOptional.get().getId());
        return "index";}
}
