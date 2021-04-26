import java.util.*;


class products extends Entity{
    private String prodid;
    private String name;
    public String getProdid() {
        return prodid;
    }
    public String getName() {
        return name;
    }
    //void setProdid(long prodid) {this.prodid = prodid;}
    //void setName(String name) {this.name = name;}
    public products (String prodid, String name) {
        this.prodid = prodid;
        this.name = name;
    }
    LinkedList<products> test() {
        LinkedList<products> arr = new LinkedList<>();
        //example
        arr.add(new products("dmoadsfh", "Tom"));
        return arr;
    }
}
