package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×";

    public void commonIntroduce() {}

    
    public abstract void eachIntroduce();

    public void execIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は"+ address +"です");
        eachIntroduce(); 
}
}

