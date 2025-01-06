package kadai_018;

abstract public class Kato_Chapter18 {
	
    public String familyName ;
	public String givenName ;
	public String address ;
	
	public void commonlntroduce() {
		System.out.println("名前:"+ familyName + "" +givenName);
		System.out.println("住所:" + address);
	}
	
	abstract public void eachIntroduce();
	
	
	public void execIntroduce() {
		commonlntroduce();
		eachIntroduce();
		
	}
}
