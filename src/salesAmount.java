public class salesAmount {
    public Integer firstSale;
    public Integer secondSale;
    public Integer thirdSale;
    public Integer fourthSale;
    public Integer fifthSale;

    public salesAmount(int one, int two, int three, int four, int five){
        this.firstSale=one;
        this.secondSale=two;
        this.thirdSale=three;
        this.fourthSale=four;
        this.fifthSale=five;
    }

    public String message(){
        return this.firstSale + " x $5 + " + this.secondSale + " x $10 + " + this.thirdSale + " x 12$ + " + this.fourthSale + " x 15$ + " + this.fifthSale + " x $20 ";
    }
}
