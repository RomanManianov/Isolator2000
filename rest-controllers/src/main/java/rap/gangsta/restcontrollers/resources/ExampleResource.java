package rap.gangsta.restcontrollers.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@Api(tags = "Можно добавить некоторый тег")
@RequestMapping("/api/v1/url")
public interface ExampleResource {

    @GetMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Получение сущьности")
    Entity getSomeEntity(@PathVariable("id") Long id,
                         @RequestBody Class clazz,
                         @CookieValue("Refresh_Token") String token,
                         @RequestParam("count") byte consumersCount);

    @PostMapping("/newEntity")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Добавляем сущьность")
    void addEntity();

    @PutMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Изменяем сущьность")
    void changeEntity(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    @ApiOperation("Удоляем сущьность")
    void deleteEntity(@PathVariable("id") Long id);
}
