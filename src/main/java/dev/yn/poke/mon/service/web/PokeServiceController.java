package dev.yn.poke.mon.service.web;

import dev.yn.poke.mon.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeServiceController {

    @Autowired
    private PokeService service;

    @RequestMapping(value = "/pokemon", method = { RequestMethod.GET}, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public Object getAllPokemon() {
        return service.getAllPokemon();
    }
}
