package com.tamas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Minden pokémonnak van neve és típusa
        // Bizonyos típusok hatékonyak egyéb típusok ellen
        // Például a víz típusúak hatékonyak a tűz típusúak ellen

        // Ash-nek van több pokémonja
        // Felbukkant egy vad pokémon!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Segíts eldönteni, Ash melyik pokémont használja!
        Pokemon chosenPokemon = chosePokemon(pokemonOfAsh, wildPokemon);

        System.out.print("I choose you, " + chosenPokemon.name);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electricity", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    private static Pokemon chosePokemon(List<Pokemon> pokemonOfAsh, Pokemon wildPokemon) {
        for (Pokemon pokemon : pokemonOfAsh) {
            if (wildPokemon.type.equals(pokemon.effectiveAgainst)) {
                return pokemon;
            }
        }
        return null;
    }

}
