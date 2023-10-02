package Example5;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;
import java.util.Queue;

class Suffix {
}

class Prefix {
}

/**
 * <p>
 * Watch out for noise words:<br>
 * 1. `ProductData`<br>
 * 2.`ProductInfo`<br>
 * Look at them , they are similar: of course they are redundant<br>
 * <p>
 * What's the difference between product and product data,<br>
 * Q1.(does this tell you what is different about it? )<br>
 * A1. No, There is type (in the system) called Product.<br>
 * </p>
 *
 * <p>
 * -Add to that: there is another type called `product Data`
 * -Yet , another `type` in the system called `Product Info`
 * <p>
 * So we have `Product Info` , and  `product Data`
 * Hm, don't forget there is also a `Product Info`,
 * <p>
 * Q2.So, what's the difference between the types `Product Info`, `product Data` ?
 * <p>
 * A2. Watch out for  `name Ambiguities`:
 * Name Ambiguity: when you add a new data type, but that data typs doesn't tell you its meaning.
 * <p>
 * So,these are `Noise Words`, thus we don't need them
 **/

class Product {
    Integer Id;
    String name;

    public Product() {

    }

    public void ProductData() {

    }

    public void ProductInfo() {
    }

}

class ProductData {

    ProductData() {

    }
}


class ProductInfo {
    @NotNull Queue queue = new PriorityQueue(); //adding `@NotNull` fixes the function nullability
    @NotNull Object object = new Object();

    ProductInfo() {


    }
}

// Noise Comes in ... Different Shapes
public class noiseWords {
    @NotNull Product _product = new Product();
    @NotNull ProductInfo productInfo = new ProductInfo();
    //Suffixes:
    Suffix product;

    Suffix productData;// Delegate
    Suffix ProductInfo;// A Delegate ,perhaps

    /**
     * Warning:
     * a Suffix is not a Delegate
     *
     * @Matt Sheppard
     * Source:https://stackoverflow.com/questions/44912/java-delegates
     * <p>
     * Takeaway: Notice the smooth naming convention of the Prefix `variable`:<br>
     * -It's a noun: a, or the followed by the object name<br>
     * Use more of  these, if you will.<br>
     **/
    //Prefixes:
    Prefix aProduct;
    Prefix theProduct;


}
