package ch_07;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    void stop() { System.out.println("멈춥니다.");};
    
}

interface Fightable { 
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{ 
    public void move(int x, int y){
        System.out.println("[" + x + "," + y +"]로 이동");
    };

    public void attack(Fightable f){
        System.out.println(f + "를 공격");
    };

    Fightable getFightable() {
        Fighter f = new Fighter();
        return f;
    }

    @Override
    public String toString() {
        return "다른 파이터";
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();
        // f.move(100,200);
        // f.attack(new Fighter());
    }
}
