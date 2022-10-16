package pro.sky.java.course2.filippovahomework21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")

public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping ("/add")
    public void add (@RequestParam ("ID") Integer ID) {
        service.add(ID);
    }


   @GetMapping("/get")
   public List<Integer> get () {
       return service.get();
   }



}
