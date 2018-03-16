package es.msanchez.patterns.builder.abstr;

public class Calzone extends Pizza {

  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Builder> {
    private boolean sauceInside = false; // Default

    public Builder sauceInside() {
      this.sauceInside = true;
      return this;
    }

    /**
     * Covariant return typing
     * {@inheritDoc}
     */
    @Override
    public Pizza build() {
      return new Calzone(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Builder self() {
      return this;
    }
  }

  public Calzone(final Builder builder) {
    super(builder);
    this.sauceInside = builder.sauceInside;
  }

}
