package Box;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String Name, int damage,int health,int weight,int dodge){
        this.name=Name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;

    }

    int hit(Fighter foe){
        System.out.println(this.name + "=>" + foe.name + " " +this.damage +" Hasar vurdu.");
        if(foe.isDodge()){
            System.out.println("Oyuncu:"+foe.name+" "+"Gelen Saldırıyı Blockladı.");
            return foe.health;
        }
        if(foe.health-this.damage<=0){
            return 0;
        }
        return foe.health-this.damage;

    }

    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return (randomNumber<=this.dodge);
    }
}
