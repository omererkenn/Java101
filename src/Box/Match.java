package Box;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;


    Match(Fighter fighter1,Fighter fighter2,int minWeight,int maxWeight){
        this.f1=fighter1;
        this.f2=fighter2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    public void run(){
        if(isCheck()){
            int count=1;
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("======"+count+"."+"ROUND======");
                if(whoStart()==1) {
                    this.f2.health = this.f1.hit(f2);
                    this.f1.health = this.f2.hit(f1);
                }else {
                    this.f1.health = this.f2.hit(f1);
                    this.f2.health = this.f1.hit(f2);
                }

                System.out.println("\tHealth.B\t="+this.f2.health);
                System.out.println("\tHealth.A\t="+this.f1.health);
                isWin();
                count++;
            }
        }else{
            System.out.println("Sikletler uymuyor.Sporcular karşılaşamaz!");
        }


    }

    public boolean isCheck(){
        return (this.f1.weight >=minWeight && this.f1.weight<=maxWeight && this.f2.weight >=minWeight && this.f2.weight<=maxWeight);

    }

    boolean isWin(){

        if (f1.health==0){
            System.out.println(f2.name+"\t:Win");
            return true;
        }else if(f2.health==0){
            System.out.println(f1.name+"\t:Win");
            return true;
        }
        return false;

    }

    int whoStart(){
        int randomNumber=(int)(Math.random()*2);
        return randomNumber;
    }
}
