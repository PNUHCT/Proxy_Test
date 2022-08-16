package Dynamic;

// 인터페이스를 상속받은 타겟. Dynamic Proxy를 이용해 위 뒤로 로그를 Weaving해봄
public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 음식을 먹습니다.");
    }

    @Override
    public void drink() {
        System.out.println("호랑이가 물을 마십니다.");
    }
}