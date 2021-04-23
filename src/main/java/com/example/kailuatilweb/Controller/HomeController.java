package com.example.kailuatilweb.Controller;

import com.example.kailuatilweb.Model.FamilyCar;
import com.example.kailuatilweb.Model.LuxuryCar;
import com.example.kailuatilweb.Model.SportCar;
import com.example.kailuatilweb.Service.FamilyCarService;
import com.example.kailuatilweb.Service.LuxuryCarService;
import com.example.kailuatilweb.Service.SportCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SportCarService sportCarService;
    @Autowired
    LuxuryCarService luxuryCarService;
    @Autowired
    FamilyCarService familyCarService;

   @GetMapping("/")
   public String index() {
        return"/index";
    }

   @GetMapping("/createSportCar")
   public String create(){
       return "/createSportCar";
   }

   @PostMapping("/createSportCar")
   public String createSportCar(@ModelAttribute SportCar sportCar){
       sportCarService.addSportCar(sportCar);
       return "redirect:/";
   }

   @PostMapping("/cars/{id}")
   public String delete(@PathVariable("id") int id) {
       boolean deleted = sportCarService.delete(id);
       if (deleted) {
           return "redirect:/";
       } else {
           return "redirect:/";
       }
   }

   @GetMapping("/cars")
   public String sportCars(Model model) {
       List<SportCar> carList = sportCarService.fetchAll();
       model.addAttribute("sportCars", carList);
       return"/cars";
   }

   @GetMapping("/familyCars")
   public String familyCars(Model model) {
       List<FamilyCar> carList = familyCarService.fetchAll();
       model.addAttribute("familyCars", carList);
       return"/familyCars";
   }
   @GetMapping("/luxuryCars")
   public String luxuryCars(Model model) {
       List<LuxuryCar> carList = luxuryCarService.fetchAll();
       model.addAttribute("luxuryCars", carList);
       return"/luxuryCars";
   }


   @GetMapping("/update/{id}")
   public String update(@PathVariable("id") int id, Model model){
       model.addAttribute("SportCar", sportCarService.findSportcarById(id));
       return "/updateSportCar";
   }

   @PostMapping("/updateSportCar")
   public String updateSportCar(@ModelAttribute SportCar sportcar){
       sportCarService.updateSportCar(sportcar.getSportCarID(), sportcar);
       return "redirect:/cars";
   }




}
