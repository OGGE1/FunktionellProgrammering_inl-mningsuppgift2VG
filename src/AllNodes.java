
import java.util.Arrays;
import java.util.List;

public class AllNodes {

    //Boss
    Node tomten = new Node("Tomten");

    //Vänstra trädet
    Node butter = new Node("Butter");
    Node rådjuret = new Node("Rådjuret");
    Node nyckelpigan = new Node("Nyckelpigan");
    Node haren = new Node("Haren");
    Node räven = new Node("Räven");
    Node myran = new Node("Myran");
    Node gråsuggan = new Node("Gråsuggan");
    Node bladlusen = new Node("Bladlusen");

    //Högra trädet
    Node glader = new Node("Glader");
    Node tröger = new Node("Tröger");
    Node trötter = new Node("Trötter");
    Node blyger = new Node("Blyger");
    Node skumtomten = new Node("Skummtomten");
    Node dammråttan = new Node("Dammråttan");


    public AllNodes() {
        tomten.addChildren(glader, butter);
        glader.addChildren(tröger, trötter, blyger);
        trötter.addChildren(skumtomten);
        skumtomten.addChildren(dammråttan);
        butter.addChildren(rådjuret, nyckelpigan, haren, räven);
        räven.addChildren(gråsuggan, myran);
        myran.addChildren(bladlusen);
    }

    public List<Node> getAllNodes() {
        return Arrays.asList(
                this.tomten,
                this.glader,
                this.butter,
                this.tröger,
                this.trötter,
                this.blyger,
                this.rådjuret,
                this.nyckelpigan,
                this.haren,
                this.räven,
                this.myran,
                this.gråsuggan,
                this.bladlusen,
                this.skumtomten,
                this.dammråttan
        );
    }

}
