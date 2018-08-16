package com.optics.rest.controller;

import com.optics.rest.domain.Player;
import com.optics.rest.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "player", produces = "application/json")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerController() {}

    @GetMapping(value = "")
    public List<Player> list() {
        return this.playerRepository.findAll();
    }

    @PostMapping(value = "")
    public Player create(@RequestBody Player player) {
        return this.playerRepository.saveAndFlush(player);
    }

    @GetMapping(value = "/{uuid}")
    public Optional<Player> get(@PathVariable UUID uuid) {
        return this.playerRepository.findById(uuid);
    }

    @PutMapping(value = "/{uuid}")
    public Player update(@PathVariable UUID uuid, @RequestBody Player player) {
        player.setId(uuid);
        return this.playerRepository.saveAndFlush(player);
    }


    @DeleteMapping(value = "/{uuid}")
    public void remove(@PathVariable UUID uuid) {
        this.playerRepository.deleteById(uuid);
    }

}
