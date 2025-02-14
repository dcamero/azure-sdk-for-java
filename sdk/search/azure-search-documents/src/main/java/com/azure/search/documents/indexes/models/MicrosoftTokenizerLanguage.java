// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MicrosoftTokenizerLanguage. */
public enum MicrosoftTokenizerLanguage {
    /** Enum value bangla. */
    BANGLA("bangla"),

    /** Enum value bulgarian. */
    BULGARIAN("bulgarian"),

    /** Enum value catalan. */
    CATALAN("catalan"),

    /** Enum value chineseSimplified. */
    CHINESE_SIMPLIFIED("chineseSimplified"),

    /** Enum value chineseTraditional. */
    CHINESE_TRADITIONAL("chineseTraditional"),

    /** Enum value croatian. */
    CROATIAN("croatian"),

    /** Enum value czech. */
    CZECH("czech"),

    /** Enum value danish. */
    DANISH("danish"),

    /** Enum value dutch. */
    DUTCH("dutch"),

    /** Enum value english. */
    ENGLISH("english"),

    /** Enum value french. */
    FRENCH("french"),

    /** Enum value german. */
    GERMAN("german"),

    /** Enum value greek. */
    GREEK("greek"),

    /** Enum value gujarati. */
    GUJARATI("gujarati"),

    /** Enum value hindi. */
    HINDI("hindi"),

    /** Enum value icelandic. */
    ICELANDIC("icelandic"),

    /** Enum value indonesian. */
    INDONESIAN("indonesian"),

    /** Enum value italian. */
    ITALIAN("italian"),

    /** Enum value japanese. */
    JAPANESE("japanese"),

    /** Enum value kannada. */
    KANNADA("kannada"),

    /** Enum value korean. */
    KOREAN("korean"),

    /** Enum value malay. */
    MALAY("malay"),

    /** Enum value malayalam. */
    MALAYALAM("malayalam"),

    /** Enum value marathi. */
    MARATHI("marathi"),

    /** Enum value norwegianBokmaal. */
    NORWEGIAN_BOKMAAL("norwegianBokmaal"),

    /** Enum value polish. */
    POLISH("polish"),

    /** Enum value portuguese. */
    PORTUGUESE("portuguese"),

    /** Enum value portugueseBrazilian. */
    PORTUGUESE_BRAZILIAN("portugueseBrazilian"),

    /** Enum value punjabi. */
    PUNJABI("punjabi"),

    /** Enum value romanian. */
    ROMANIAN("romanian"),

    /** Enum value russian. */
    RUSSIAN("russian"),

    /** Enum value serbianCyrillic. */
    SERBIAN_CYRILLIC("serbianCyrillic"),

    /** Enum value serbianLatin. */
    SERBIAN_LATIN("serbianLatin"),

    /** Enum value slovenian. */
    SLOVENIAN("slovenian"),

    /** Enum value spanish. */
    SPANISH("spanish"),

    /** Enum value swedish. */
    SWEDISH("swedish"),

    /** Enum value tamil. */
    TAMIL("tamil"),

    /** Enum value telugu. */
    TELUGU("telugu"),

    /** Enum value thai. */
    THAI("thai"),

    /** Enum value ukrainian. */
    UKRAINIAN("ukrainian"),

    /** Enum value urdu. */
    URDU("urdu"),

    /** Enum value vietnamese. */
    VIETNAMESE("vietnamese");

    /** The actual serialized value for a MicrosoftTokenizerLanguage instance. */
    private final String value;

    MicrosoftTokenizerLanguage(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MicrosoftTokenizerLanguage instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MicrosoftTokenizerLanguage object, or null if unable to parse.
     */
    @JsonCreator
    public static MicrosoftTokenizerLanguage fromString(String value) {
        if (value == null) {
            return null;
        }
        MicrosoftTokenizerLanguage[] items = MicrosoftTokenizerLanguage.values();
        for (MicrosoftTokenizerLanguage item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
