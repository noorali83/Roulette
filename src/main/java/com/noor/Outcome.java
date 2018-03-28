package com.noor;

import java.text.MessageFormat;

public class Outcome {

    private final String name;

    private final int odd;

    public Outcome(String name, int odd) {
        this.name = name;
        this.odd = odd;
    }

    public int getWinningAmount(int amount) {
        return this.odd * amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Outcome outcome = (Outcome) o;

        return name != null ? name.equals(outcome.name) : outcome.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} ({1}:1)", new Object[] {this.name, this.odd});
    }
}
