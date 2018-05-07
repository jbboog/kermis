import java.util.Scanner;

class Kermis {   // hierin stop alle methoden die gecalled kunnen worden op de attracties.

  public static void main(String[] args){		// static is class var of met, niet static is object var of met.
    Kermis kermis = new Kermis();
    kermis.draaiAttractie();
  }

  int userInput(){   //System.in geeft string.
    System.out.println("kies een attractie");  // deze tekst nog een beetje mooi maken.
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();


    int output = Integer.parseInt(input);   //de string omzetten in een Integer
    // hier moet ik een exception of if statement bouwen voor als de input geen int kan worden.
    // er moet een if komen voor als de input minder dan 1 of meer dan 6 is.
    // input "?" maakt dat je de regels nog een keer ziet.
    scanner.close();
    return output; 
  }

  void draaiAttractie(){

	Botsauto botsauto = new Botsauto("Botsauto's");
	Spin spin = new Spin("De Spin");
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis("Het spiegelpaleis");
	Spookhuis spookhuis = new Spookhuis("Het spookhuis");
	Hawaii hawaii = new Hawaii("Hawaii");
	Ladderklimmen ladderklimmen = new Ladderklimmen("Stairways to heaven");
  
	int inp = userInput();

    switch(inp){
      case 1: botsauto.draaien();
              break;
      case 2: spin.draaien();
      		  break;
      case 3: spiegelpaleis.draaien();
              break;
      case 4: spookhuis.draaien();
              break;
      case 5: hawaii.draaien();
              break;
      case 6: ladderklimmen.draaien();
              break;
      default: System.out.println("Ongeldige input");  //ik kan hier ook een error gaan throwen die ik niet in userInput() vang (als er iets goed mis gaat)
      		    userInput();

    }
  }
}
  