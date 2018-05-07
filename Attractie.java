interface Draaien {	//deze interface wordt overgeerft door alle subclasses van Attractie
	void draaien();
}

abstract public class Attractie implements Draaien {        // een .java sourcecode file mag maar 1 public class bevatten!
  String naam;

  public Attractie(String naam){
    this.naam = naam;
  } 
}


class Botsauto extends Attractie {
  String naam;    // is dit nodig als het al in de constructor staat?

  Botsauto(String naam){//contructor
	super(naam);
	this.naam = naam; //this.naam vanwege de scope, nu weet java dat ik de class variable bedoel en niet de local variable.
  }
  public void draaien(){ 
    System.out.println("De botsauto's draaien "); //wellicht kan ik hier ook een leuk return type van maken die .naam gebruikt enzo
  }
}


class Spin extends Attractie {
  String naam;

  Spin(String naam){
	super(naam);
    this.naam = naam;
  }
  public void draaien(){
    System.out.println("De spin draait");
  }
}


class Spiegelpaleis extends Attractie {
	  String naam;

	  Spiegelpaleis(String naam){
	    super(naam);
	    this.naam = naam;
	  }
	  public void draaien(){
	    System.out.println("Het spiegelpaleis draait");
	  }
	}


class Spookhuis extends Attractie {
	  String naam;

	  Spookhuis(String naam){
	    super(naam);
	    this.naam = naam;
	  }
	  public void draaien(){
	    System.out.println("Het spookhuis draait");
	  }
	}


class Hawaii extends Attractie {
	  String naam;

	  Hawaii(String naam){
	    super(naam);
	    this.naam = naam;
	  }
	  public void draaien(){
	    System.out.println("Hawaii draait");
	  }
	}


class Ladderklimmen extends Attractie {
	  String naam;

	  Ladderklimmen(String naam){
	    super(naam);
	    this.naam = naam;
	  }
	  public void draaien(){
	    System.out.println("De ladder draait");
	  }
	}


  

