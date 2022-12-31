package org.example;

public class SoundOfMusic extends Movie{

    public SoundOfMusic() {
    }

    public SoundOfMusic(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Sound of Music";
    }

    @Override
    public String plot() {
        return "A german frauline and seven kids";
    }
}
