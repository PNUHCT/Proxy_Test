package Dynamic;

// 인터페이스를 상속받은 타겟. Dynamic Proxy를 이용해 위 뒤로 로그를 Weaving해봄
public class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 음식을 먹습니다.");
    }

    @Override
    public void drink() {
        System.out.println("토끼가 물을 마십니다.");
    }
}