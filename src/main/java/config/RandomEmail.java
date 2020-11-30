package config;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class RandomEmail {
    public static String generateString() {
       return RandomStringUtils. random ( 5 , true , true ) +  "@gmail.com ";
    }
}
