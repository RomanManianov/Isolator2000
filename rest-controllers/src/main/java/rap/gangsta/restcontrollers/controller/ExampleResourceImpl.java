package rap.gangsta.restcontrollers.controller;

import org.springframework.web.bind.annotation.RestController;
import rap.gangsta.restcontrollers.resources.ExampleResource;

import javax.swing.text.html.parser.Entity;

@RestController
public class ExampleResourceImpl implements ExampleResource {


    @Override
    public Entity getSomeEntity(Long id, Class clazz, String token, byte consumersCount) {
        return null;
    }

    @Override
    public void addEntity() {
    }


    @Override
    public void changeEntity(Long id) {
    }

    @Override
    public void deleteEntity(Long id) {
    }
}
