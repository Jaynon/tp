package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Gender {
    public static final String MESSAGE_CONSTRAINTS =
            "TBA";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = ".*";

    public final String value;

    /**
     * Constructs a {@code gender}.
     *
     * @param gender A valid gender.
     */
    public Gender(String gender) {
        requireNonNull(gender);
        checkArgument(isValidGender(gender), MESSAGE_CONSTRAINTS);
        value = gender;
    }

    /**
     * Returns true if a given string is a valid gender.
     */
    public static boolean isValidGender(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Gender)) {
            return false;
        }

        Gender othergender = (Gender) other;
        return value.equals(othergender.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
