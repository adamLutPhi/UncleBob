package DesignPatterns.Consumers;


import DesignPatterns.Deliverable;
import DesignPatterns.Patterns;
import org.jetbrains.annotations.NotNull;

class defaultConsumer extends Object { //
    Integer hashCode;

    public Integer getHashCode() {
        return hashCode;
    }

    public void setHashCode(Integer hashCode) {
        this.hashCode = hashCode;
    }
}

class specificConsumer extends defaultConsumer {

    public specificConsumer() {
        super();
    }

    public specificConsumer(Patterns.@NotNull SpecificDeliverable specificDeliverable) {
        super();
        hashCode = specificDeliverable.hashCode();
        specificDeliverable.toString();
    }
}

public class Consumer extends defaultConsumer {

    public Consumer() {
        super();
    }

    public Consumer(@NotNull Deliverable deliverable) {

        hashCode = deliverable.hashCode();
    }


}
