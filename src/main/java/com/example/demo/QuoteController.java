package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private final List<String> quotes = new ArrayList<>();

    public QuoteController() {
        // Добавьте жизнеутверждающие цитаты в список
        quotes.add("Той, хто позбавлений щирих друзів, воістину самотній.");
        quotes.add("Ніхто не усвідомлює краси подорожі, поки не приходить додому і не прикладає голову на стару знайому подушку.");
        quotes.add("Якщо б діти росли у відповідності з нашими очікуваннями, у нас виростали б лише генії.");
    }
    @GetMapping("/quote")
    public String getRandomQuote() {
        // Получите случайную цитату из списка
        Random rand = new Random();
        int index = rand.nextInt(quotes.size());
        return quotes.get(index);
    }
}
