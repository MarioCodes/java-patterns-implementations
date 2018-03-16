package es.msanchez.patterns.builder.abstr;

import es.msanchez.patterns.utilities.Size;

public class NyPizza extends Pizza {

  private final Size size;

  public static class Builder extends Pizza.Builder<Builder> {
    private final Size size;

    public Builder(final Size size) {
      this.size = size;
    }

    /**
     * Covariant return typing
     * {@inheritDoc}
     */
    @Override
    public Pizza build() {
      return new NyPizza(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Builder self() {
      return this;
    }
  }

  private NyPizza(final Builder builder) {
    super(builder);
    this.size = builder.size;
  }

}
