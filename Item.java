class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	Char danok = 'A';

	//TODO constructor
	Item(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//TODO setters and getters
	void setID (int id){
		this.id=id;}
	void setName(String name){
		this.name=name;}
	void setPrice(double price){
		this.price=price;}
	int getID(){
		return id;}

	String getName(){
		return name;}

	double getPrice(){
		return price;}

	double taxReturn () {
		//TODO
		double danok = 0.0;
		double sum = (18/100)*price;
		danok = (15/100)*sum;	
		return danok;
	}
}