package com.example;

import java.util.Random;

public class JokeLibrary {
    static Random rand = new Random();


    private static final String[] JOKES = {
            "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you.",
            "If i had a dollar for every girl that found me unattractive, they would eventually find me attractive.",
            "Whenever I find the key to success, someone changes the lock.",
            "A recent study has found that women who carry a little extra weight live longer than the men who mention it.",
            "I want to die peacefully in my sleep, like my grandfather.. Not screaming and yelling like the passengers in his car.",
            "Just read that 4,153,237 people got married last year, not to cause any trouble but shouldn't that be an even number?",
            "I asked God for a bike, but I know God works in mysterious ways. So I stole a bike and asked for forgiveness.",
            "I'm great at multitasking. I can waste time, be unproductive, and procrastinate all at once.",
            "If God is watching us, the least we can do is be entertaining.",
            "I like work: it fascinates me. I can sit and look at it for hours.",
            "My wife and I were happy for twenty years. Then we met.",
            "I think my neighbor is stalking me as she's been googling my name on her computer. I saw it through my telescope last night.",
            "I can totally keep secrets. It's the people I tell them to that can't."
    };
    public static String getJoke() {
        int  number = rand.nextInt(14);
        return JOKES[number];
    }
}
