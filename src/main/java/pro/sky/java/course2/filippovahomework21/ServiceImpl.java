package pro.sky.java.course2.filippovahomework21;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@SessionScope
public class ServiceImpl implements Service {
    private final List <Integer> basket;

    public ServiceImpl() {
        this.basket = new ArrayList<>();
    }

    @Override
    public void add(Integer ID) {
    basket.add (ID);
    };

    @Override
    public List<Integer> get() {
        return basket;
    }
}
