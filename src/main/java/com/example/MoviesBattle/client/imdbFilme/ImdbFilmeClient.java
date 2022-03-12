package com.example.MoviesBattle.client.imdbFilme;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "filme", url = "https://imdb-api.com/en/API/Top250Movies/k_4g22eka3")
public interface ImdbFilmeClient {

    @GetMapping
    ConvertToFilme getFilmes();

}
