package rap.gangsta.restcontrollers.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@Api("Можно добавить некоторый тег")
@RequestMapping("/api/v1/url")
public interface ExampleResource {

    @GetMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Получение сущности")
    Entity getSomeEntity(@PathVariable("id") Long id,
                         @RequestBody Class clazz,
                         @CookieValue("Refresh_Token") String token,
                         @RequestParam("count") byte consumersCount);

    @PostMapping("/newEntity")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Добавляем сущность")
    void addEntity();

    @PutMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Изменяем сущность")
    void changeEntity(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Удаляем сущность")
    void deleteEntity(@PathVariable("id") Long id);


}
