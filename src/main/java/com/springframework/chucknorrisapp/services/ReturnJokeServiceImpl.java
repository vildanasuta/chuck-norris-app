package com.springframework.chucknorrisapp.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ReturnJokeServiceImpl implements ReturnJokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ReturnJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String returnJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
