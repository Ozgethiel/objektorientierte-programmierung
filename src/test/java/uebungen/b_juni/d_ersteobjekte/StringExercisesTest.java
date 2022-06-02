package uebungen.b_juni.d_ersteobjekte;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringExercisesTest {

    public static final String STAR_WARS_INTRO = "it is a period of civil war rebel spaceships striking from a hidden base have won their first " +
            "victory against the evil galactic empire during the battle rebel spies managed to steal secret plans to the empire s ultimate weapon " +
            "the death star an armored space station with enough power to destroy an entire planet pursued by the empire s sinister agents princess " +
            "leia races home aboard her starship custodian of the stolen plans that can save her people and restore freedom to the galaxy";
    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut " +
            "labore et dolore magna aliquyam erat sed diam voluptua At vero eos et accusam et justo duo dolores et ea rebum Stet clita kasd gubergren " +
            "no sea takimata sanctus est";

    @Test
    void charAtPosition() {
        char result = StringExercises.charAtPosition("Hallo", 1);

        assertThat(result).isEqualTo('a');
    }

    @Test
    void substringBefore() {
        String result = StringExercises.substringBefore(STAR_WARS_INTRO, "managed");

        assertThat(result).isEqualTo("it is a period of civil war rebel spaceships striking from a hidden base have won their first " +
                "victory against the evil galactic empire during the battle rebel spies ");
    }

    @Test
    void optimist() {
        String result = StringExercises.optimist("Das Glas ist halbleer");

        assertThat(result).isEqualTo("Das Glas ist halbvoll");
    }
}